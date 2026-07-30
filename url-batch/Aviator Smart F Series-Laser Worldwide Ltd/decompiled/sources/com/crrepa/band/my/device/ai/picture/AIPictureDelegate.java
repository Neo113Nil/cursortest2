package com.crrepa.band.my.device.ai.picture;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.artillery.ctc.CtHelper;
import com.artillery.ctc.base.ChatPictureRequestBody;
import com.artillery.ctc.interfaces.IChatPictureCallback;
import com.artillery.ctc.interfaces.ISimpleCallback;
import com.baidu.ar.util.SystemInfoUtil;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.picture.AIPictureDelegate;
import com.crrepa.band.my.device.ai.picture.model.AIPictureStyleBean;
import com.crrepa.band.my.model.db.WatchFace;
import com.crrepa.band.my.model.db.proxy.WatchFaceDaoProxy;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.moyoung.lib.ai.img.ImgStyleDelegate;
import com.moyoung.lib.ai.img.f;
import com.my.lib.AFlash;
import com.my.lib.data.DrawStyle;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.SubscriptionInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes2.dex */
public class AIPictureDelegate {
    private static final String[] PICTURE_STYLE_ARRAY = {"205", "106", "105", com.crrepa.band.my.device.watchfacenew.delegate.img.m.NEW_CUSTOM_WATCH_FACE_PRESET_IMG, "303", "302", "305", "306"};

    class a implements IChatPictureCallback {
        final /* synthetic */ d1 val$imgCallback;
        final /* synthetic */ int val$watchFaceH;
        final /* synthetic */ int val$watchFaceW;

        a(d1 d1Var, int i8, int i9) {
            this.val$imgCallback = d1Var;
            this.val$watchFaceW = i8;
            this.val$watchFaceH = i9;
        }

        @Override // com.artillery.ctc.interfaces.IChatFailCallback
        public void onFail(int i8, @NonNull String str) {
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(i8, str));
            this.val$imgCallback.onFail(String.valueOf(i8), str);
        }

        @Override // com.artillery.ctc.interfaces.IChatPictureCallback
        public void onSuccess(@NonNull List<Pair<String, String>> list) {
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(list));
            if (list.size() == 0) {
                this.val$imgCallback.onFail("-1", "No picture");
                return;
            }
            String second = list.get(0).getSecond();
            AIPictureDelegate.scaleAndCropPicture(second, this.val$watchFaceW, this.val$watchFaceH);
            this.val$imgCallback.onSuccess(second);
        }
    }

    class b implements com.moyoung.lib.ai.img.b {
        final /* synthetic */ d1 val$imgCallback;
        final /* synthetic */ int val$watchFaceH;
        final /* synthetic */ int val$watchFaceW;

        b(int i8, int i9, d1 d1Var) {
            this.val$watchFaceW = i8;
            this.val$watchFaceH = i9;
            this.val$imgCallback = d1Var;
        }

        @Override // com.moyoung.lib.ai.img.b
        public void onError(String str) {
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(-1, str));
            Log.d("MoyAI", "onFail: " + str);
            this.val$imgCallback.onFail("-1", str);
        }

        @Override // com.moyoung.lib.ai.img.b
        public /* bridge */ /* synthetic */ void onProcessing(String str) {
            com.moyoung.lib.ai.img.a.a(this, str);
        }

        @Override // com.moyoung.lib.ai.img.b
        public void onSuccess(String str, String str2) {
            String str3 = str + ", " + str2;
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str3));
            Log.d("MoyAI", "onSuccess: " + str3);
            AIPictureDelegate.scaleAndCropPicture(str, this.val$watchFaceW, this.val$watchFaceH);
            this.val$imgCallback.onSuccess(str);
        }
    }

    class c implements ImgStyleDelegate.a {
        final /* synthetic */ d val$callback;

        c(d dVar) {
            this.val$callback = dVar;
        }

        @Override // com.moyoung.lib.ai.img.ImgStyleDelegate.a
        public void onError(String str) {
        }

        @Override // com.moyoung.lib.ai.img.ImgStyleDelegate.a
        public void onSuccess(List<com.moyoung.lib.ai.img.g> list, int i8) {
            Log.d("MoyAI", "onSuccess: " + list.toString());
            ArrayList arrayList = new ArrayList();
            for (com.moyoung.lib.ai.img.g gVar : list) {
                arrayList.add(new AIPictureStyleBean(gVar.getId(), gVar.getName(), gVar.getUrl()));
            }
            this.val$callback.onStyleResult(arrayList);
        }
    }

    public interface d {
        void onFail();

        void onStyleResult(List<AIPictureStyleBean> list);
    }

    private static boolean contains(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dealHuaqiaoPictureStyleResult(d dVar, String str) {
        try {
            List<AIPictureStyleBean> list = (List) new Gson().fromJson(str, new TypeToken<List<AIPictureStyleBean>>() { // from class: com.crrepa.band.my.device.ai.picture.AIPictureDelegate.4
            }.getType());
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (AIPictureStyleBean aIPictureStyleBean : list) {
                    if (contains(PICTURE_STYLE_ARRAY, aIPictureStyleBean.getStyle())) {
                        arrayList.add(aIPictureStyleBean);
                    }
                }
                dVar.onStyleResult(arrayList);
                return;
            }
            dVar.onFail();
        } catch (Exception unused) {
            dVar.onFail();
        }
    }

    public static WatchFace getWatchFace() {
        String name = com.crrepa.band.my.ble.band.utils.a.getInstance().getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        return new WatchFaceDaoProxy().getWatchFace(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y5.w lambda$requestAFlashImg$0(int i8, int i9, d1 d1Var, String str, String str2, File file, File file2, SubscriptionInfo subscriptionInfo) {
        String str3 = str + ", " + str2 + ", " + file + ", " + file2;
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str3));
        Log.d("AFlash", "onSuccess: " + str3);
        scaleAndCropPicture(file.getAbsolutePath(), i8, i9);
        d1Var.onSuccess(file.getAbsolutePath());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y5.w lambda$requestAFlashImg$1(d1 d1Var, String str, ErrorCode errorCode) {
        String str2 = str + ", " + errorCode.getCode() + SystemInfoUtil.COMMA + errorCode.getMessage();
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(-1, str2));
        Log.d("AFlash", "onFail: " + str2);
        com.crrepa.band.my.device.ai.helper.c.checkUnauthorized(errorCode.getCode());
        d1Var.onFail(errorCode.getCode(), errorCode.getMessage());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y5.w lambda$requestAFlashImgStyle$2(d dVar, String str, List list) {
        Log.d("AFlash", "onSuccess: " + list.toString());
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DrawStyle drawStyle = (DrawStyle) it.next();
            arrayList.add(new AIPictureStyleBean(String.valueOf(drawStyle.getValue()), drawStyle.getName(), drawStyle.getAvatarUrl()));
        }
        dVar.onStyleResult(arrayList);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y5.w lambda$requestAFlashImgStyle$3(d dVar, String str, ErrorCode errorCode) {
        Log.d("AFlash", "errorCode: " + errorCode.getCode() + "，Message：" + errorCode.getMessage());
        dVar.onFail();
        return null;
    }

    private static void requestAFlashImg(String str, String str2, final d1 d1Var, final int i8, final int i9) {
        String picturesFilePath = com.moyoung.dafit.module.common.utils.g0.getPicturesFilePath(com.moyoung.dafit.module.common.utils.d.get(), "AFlash");
        String str3 = com.moyoung.dafit.module.common.utils.x0.isEmpty(str2) ? "0" : str2;
        String currentLanguage = com.crrepa.band.my.device.ai.asr.b.getCurrentLanguage();
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(currentLanguage + ",,," + str3 + ",,," + str));
        AFlash.Companion.getInstance().textDrawingToFile(com.moyoung.dafit.module.common.utils.d.get(), com.crrepa.band.my.device.ai.helper.d.getUUID(), com.crrepa.band.my.device.ai.helper.c.getWID(), com.crrepa.band.my.device.ai.helper.d.getUUID(), str, picturesFilePath, "png", Integer.parseInt(str3), currentLanguage, new f6.s() { // from class: com.crrepa.band.my.device.ai.picture.i
            @Override // f6.s
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                y5.w lambda$requestAFlashImg$0;
                lambda$requestAFlashImg$0 = AIPictureDelegate.lambda$requestAFlashImg$0(i8, i9, d1Var, (String) obj, (String) obj2, (File) obj3, (File) obj4, (SubscriptionInfo) obj5);
                return lambda$requestAFlashImg$0;
            }
        }, new f6.p() { // from class: com.crrepa.band.my.device.ai.picture.j
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                y5.w lambda$requestAFlashImg$1;
                lambda$requestAFlashImg$1 = AIPictureDelegate.lambda$requestAFlashImg$1(d1.this, (String) obj, (ErrorCode) obj2);
                return lambda$requestAFlashImg$1;
            }
        });
    }

    private static void requestHuaqiaoImg(String str, String str2, d1 d1Var, int i8, int i9) {
        ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams = new ChatPictureRequestBody.ChatOverseasPictureParams(str);
        chatOverseasPictureParams.resizeWidth = 512;
        chatOverseasPictureParams.resizeHeight = 512;
        chatOverseasPictureParams.style = str2;
        chatOverseasPictureParams.language = com.crrepa.band.my.device.ai.helper.g.getAISupportedLanguageCode();
        CtHelper.Companion companion = CtHelper.Companion;
        chatOverseasPictureParams.oversea = Integer.valueOf(companion.get().isOverseas() ? 1 : 0);
        ChatPictureRequestBody chatPictureRequestBody = new ChatPictureRequestBody();
        chatPictureRequestBody.overseas = chatOverseasPictureParams;
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(chatPictureRequestBody));
        companion.get().aiImageWithBodyV3Overseas(chatPictureRequestBody, new a(d1Var, i8, i9));
    }

    private static void requestMoyImg(String str, String str2, d1 d1Var, int i8, int i9) {
        com.moyoung.lib.ai.e.get().img.textDrawingToFile(new f.a().setPrompt(str).setImgFileDir(com.moyoung.dafit.module.common.utils.g0.getPicturesFilePath(com.moyoung.dafit.module.common.utils.d.get(), "moy_ai_img")).setStyle(str2).build(), new b(i8, i9, d1Var));
    }

    private void requestMoyImgStyle(d dVar) {
        com.moyoung.lib.ai.e.get().imgStyle.requestStyleList(new c(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void scaleAndCropPicture(@NonNull String str, int i8, int i9) {
        com.moyoung.dafit.module.common.utils.g.scaleAndCropBitmapAndSave(str, i8, i9);
    }

    public void requestAFlashImgStyle(final d dVar) {
        AFlash.Companion.getInstance().fetchDrawStyleList(com.moyoung.dafit.module.common.utils.d.get(), com.crrepa.band.my.device.ai.helper.d.getUUID(), com.crrepa.band.my.device.ai.helper.c.getWID(), com.crrepa.band.my.device.ai.asr.b.getCurrentLanguage(), new f6.p() { // from class: com.crrepa.band.my.device.ai.picture.l
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                y5.w lambda$requestAFlashImgStyle$2;
                lambda$requestAFlashImgStyle$2 = AIPictureDelegate.lambda$requestAFlashImgStyle$2(AIPictureDelegate.d.this, (String) obj, (List) obj2);
                return lambda$requestAFlashImgStyle$2;
            }
        }, new f6.p() { // from class: com.crrepa.band.my.device.ai.picture.m
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                y5.w lambda$requestAFlashImgStyle$3;
                lambda$requestAFlashImgStyle$3 = AIPictureDelegate.lambda$requestAFlashImgStyle$3(AIPictureDelegate.d.this, (String) obj, (ErrorCode) obj2);
                return lambda$requestAFlashImgStyle$3;
            }
        });
    }

    public void requestAIPicture(String str, String str2, d1 d1Var) {
        if (com.crrepa.band.my.device.ai.helper.d.isUnauthorizedAndShowTips() && com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            return;
        }
        int screenWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
        int screenHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        CRPWatchFaceLayoutInfo aIWatchFaceLayoutInfo = AIProvider.getAIWatchFaceLayoutInfo();
        if (aIWatchFaceLayoutInfo != null) {
            screenWidth = aIWatchFaceLayoutInfo.getWidth();
            screenHeight = aIWatchFaceLayoutInfo.getHeight();
            Log.d("requestAIPicture", "layoutInfo != null， watchFaceW=" + screenWidth + " watchFaceH=" + screenHeight);
        } else {
            WatchFace watchFace = getWatchFace();
            if (watchFace != null) {
                screenWidth = watchFace.getWidth().intValue();
                screenHeight = watchFace.getHeight().intValue();
                Log.d("requestAIPicture", "watchFace != null， watchFaceW=" + screenWidth + " watchFaceH=" + screenHeight);
            } else {
                Log.d("requestAIPicture", "watchFace == null， watchFaceW=" + screenWidth + " watchFaceH=" + screenHeight);
            }
        }
        if (AIProvider.getProviderType() == 0) {
            requestHuaqiaoImg(str, str2, d1Var, screenWidth, screenHeight);
        } else if (AIProvider.getProviderType() == 1) {
            requestAFlashImg(str, str2, d1Var, screenWidth, screenHeight);
        } else {
            requestMoyImg(str, str2, d1Var, screenWidth, screenHeight);
        }
    }

    public void requestAIPictureForWatch(String str, d1 d1Var) {
        requestAIPicture(str, AIProvider.getSelectedPictureStyleCode(), d1Var);
        com.crrepa.band.my.device.ai.helper.d.logPictureImgEvent(true);
    }

    public void requestHuaqiaoImgStyle(final d dVar) {
        CtHelper.Companion.get().aiStyleOverseas(3, com.crrepa.band.my.device.ai.helper.g.getAISupportedLanguageCode(), new ISimpleCallback() { // from class: com.crrepa.band.my.device.ai.picture.k
            @Override // com.artillery.ctc.interfaces.ISimpleCallback
            public final void onSuccess(String str) {
                AIPictureDelegate.dealHuaqiaoPictureStyleResult(AIPictureDelegate.d.this, str);
            }
        });
    }

    public void requestPictureStyle(d dVar) {
        if (AIProvider.getProviderType() == 0) {
            requestHuaqiaoImgStyle(dVar);
        } else if (AIProvider.getProviderType() == 1) {
            requestAFlashImgStyle(dVar);
        } else {
            requestMoyImgStyle(dVar);
        }
    }
}
