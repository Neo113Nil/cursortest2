package com.crrepa.band.my.home.device.adapter;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;
import cn.hutool.core.text.l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ItemWatchFaceBinding;
import com.crrepa.band.my.databinding.LayoutItemWatchFaceHisiliconLabelBinding;
import com.crrepa.band.my.databinding.LayoutNewWatchFacePointerPreviewBinding;
import com.crrepa.band.my.device.ai.picture.model.AIPictureModel;
import com.crrepa.band.my.device.watchfacenew.delegate.img.i;
import com.crrepa.band.my.device.watchfacenew.delegate.img.m;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.f;
import com.crrepa.band.my.device.watchfacenew.video.model.LocalVideoModel;
import com.crrepa.band.my.model.WatchFaceModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.crrepa.band.my.model.band.provider.BandPresetWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.watchface.DefaultWatchFaceProvider;
import com.crrepa.band.my.model.db.WatchFace;
import com.crrepa.band.my.model.db.proxy.WatchFaceDaoProxy;
import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceElementInfo;
import com.crrepa.ble.conn.type.CRPWatchFaceTimeStyle;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.List;
import w1.j;

/* loaded from: classes2.dex */
public class WatchFaceAdapter extends BaseQuickAdapter<WatchFaceModel, b> {
    private static final int DEFAULT_WATCH_FACE_INDEX = -1;
    private final String VIEW_INVALIDATE_TAG;
    private boolean circleScreen;
    private BaseBandModel connectBand;
    private int displayWatchFaceIndex;
    private boolean roundedRectangleScreen;
    private WatchFace watchFace;
    private final WatchFaceDaoProxy watchFaceDaoProxy;
    private final BaseWatchFaceProvider watchFaceProvider;

    class a implements Runnable {
        final /* synthetic */ ImageView val$imageView;

        a(ImageView imageView) {
            this.val$imageView = imageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.val$imageView.getTag() == null || !this.val$imageView.getTag().equals("INVALIDATE")) {
                int measuredWidth = this.val$imageView.getMeasuredWidth();
                int measuredHeight = this.val$imageView.getMeasuredHeight();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.val$imageView.getLayoutParams();
                float watchFaceRatio = WatchFaceAdapter.this.getWatchFaceRatio();
                layoutParams.width = (int) (measuredWidth * watchFaceRatio);
                layoutParams.height = (int) (measuredHeight * watchFaceRatio);
                this.val$imageView.setLayoutParams(layoutParams);
                if (watchFaceRatio != 1.0f) {
                    this.val$imageView.setTag("INVALIDATE");
                }
            }
        }
    }

    static class b extends BaseViewHolder {
        private final ItemWatchFaceBinding binding;

        public b(View view) {
            super(view);
            this.binding = ItemWatchFaceBinding.bind(view);
        }

        public ItemWatchFaceBinding getDataBinding() {
            return this.binding;
        }
    }

    public WatchFaceAdapter() {
        super(R.layout.item_watch_face);
        this.connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        this.circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
        this.roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
        this.watchFaceProvider = new DefaultWatchFaceProvider();
        this.watchFaceDaoProxy = new WatchFaceDaoProxy();
        this.VIEW_INVALIDATE_TAG = "INVALIDATE";
        this.displayWatchFaceIndex = -1;
        addChildClickViewIds(R.id.btn_watch_face_edit, R.id.iv_add_watch_face, R.id.iv_center_logo);
    }

    private float getHisiliconViewAndLabelRatio(int i8, int i9) {
        if (i8 == 0) {
            return 1.0f;
        }
        return i8 / i9;
    }

    private float getPointerViewAndLabelRatio(int i8, int i9) {
        if (i8 == 0) {
            return 1.0f;
        }
        return i8 / i9;
    }

    private WatchFace getWatchFace() {
        WatchFace watchFace = this.watchFaceDaoProxy.getWatchFace(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        this.watchFace = watchFace;
        return watchFace;
    }

    private int getWatchFaceHeight(WatchFace watchFace) {
        if (watchFace != null && watchFace.getHeight() != null) {
            return watchFace.getHeight().intValue();
        }
        if (com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.isJieliWatchFaceConfigInfoSynced()) {
            return i.getScreenHeight();
        }
        return 240;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getWatchFaceRatio() {
        float intValue;
        if (this.watchFace == null) {
            this.watchFace = getWatchFace();
        }
        if (this.watchFace != null) {
            try {
                intValue = r0.getWidth().intValue() / this.watchFace.getHeight().floatValue();
            } catch (NullPointerException e8) {
                e8.printStackTrace();
            }
            if (1.0f >= intValue) {
                return 1.0f;
            }
            return intValue;
        }
        intValue = 1.0f;
        if (1.0f >= intValue) {
        }
    }

    private int getWatchFaceWidth(WatchFace watchFace) {
        if (watchFace != null && watchFace.getWidth() != null) {
            return watchFace.getWidth().intValue();
        }
        if (com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.isJieliWatchFaceConfigInfoSynced()) {
            return i.getScreenWidth();
        }
        return 240;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNewWatchFace$0(ImageView imageView, WatchFaceModel watchFaceModel, String str) {
        if (TextUtils.isEmpty(str)) {
            setDefaultDownloadWatchFace(imageView);
        } else {
            setDownloadWatchFace(imageView, str);
            this.watchFaceProvider.saveWatchFacePreview(watchFaceModel.getWatchFaceId(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNewWatchFace$1(ImageView imageView, Throwable th) {
        setDefaultDownloadWatchFace(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderHisiliconLabel$4(RelativeLayout relativeLayout, int i8, CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo, int i9, LayoutItemWatchFaceHisiliconLabelBinding layoutItemWatchFaceHisiliconLabelBinding) {
        float hisiliconViewAndLabelRatio = getHisiliconViewAndLabelRatio(relativeLayout.getMeasuredHeight(), i8);
        layoutItemWatchFaceHisiliconLabelBinding.llHisiliconLabel.setPositionInParent(((int) (cRPHisiliconWatchFaceLayoutInfo.getX() * hisiliconViewAndLabelRatio)) + 8, (int) (i9 * hisiliconViewAndLabelRatio));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderJieliLabel$3(LayoutNewWatchFacePointerPreviewBinding layoutNewWatchFacePointerPreviewBinding, CRPWatchFaceType cRPWatchFaceType, f fVar) {
        float pointerViewAndLabelRatio = getPointerViewAndLabelRatio(layoutNewWatchFacePointerPreviewBinding.rlPointerLabelRoot.getMeasuredHeight(), i.getScreenHeight());
        Log.d("JieliWatchFaceLayoutInf", "radio=" + pointerViewAndLabelRatio);
        CRPJieliWatchFaceLayoutInfo jieliWatchFaceLayoutInfo = com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getJieliWatchFaceLayoutInfo(cRPWatchFaceType);
        Log.d("JieliWatchFaceLayoutInf", "0-" + jieliWatchFaceLayoutInfo);
        fVar.showPointerLabel(jieliWatchFaceLayoutInfo, pointerViewAndLabelRatio);
        int selectedHandId = com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getSelectedHandId(cRPWatchFaceType);
        String selectedPointerPreviewPath = com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getSelectedPointerPreviewPath(cRPWatchFaceType);
        fVar.renderPointerPreviewImg((!x0.isNotEmpty(selectedPointerPreviewPath) || selectedHandId == 0) ? null : new File(selectedPointerPreviewPath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCustomizeWatchFaceLayout$2(ImageView imageView, LinearLayout linearLayout) {
        int measuredHeight = imageView.getMeasuredHeight();
        int watchFaceRatio = ((measuredHeight - ((int) (measuredHeight * getWatchFaceRatio()))) / 2) + o.dp2px(imageView.getContext(), getWatchFaceRatio() * 18.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.setMarginEnd(watchFaceRatio);
        linearLayout.setLayoutParams(layoutParams);
    }

    @SuppressLint({"CheckResult"})
    private void loadNewWatchFace(final WatchFaceModel watchFaceModel, final ImageView imageView) {
        String url = watchFaceModel.getUrl();
        com.orhanobut.logger.f.d("loadNewWatchFace: " + url);
        com.orhanobut.logger.f.d("loadNewWatchFace: " + watchFaceModel.getWatchFaceId());
        if (TextUtils.isEmpty(url)) {
            this.watchFaceProvider.getWatchFacePreview(watchFaceModel.getWatchFaceId()).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.home.device.adapter.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    WatchFaceAdapter.this.lambda$loadNewWatchFace$0(imageView, watchFaceModel, (String) obj);
                }
            }, new Consumer() { // from class: com.crrepa.band.my.home.device.adapter.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    WatchFaceAdapter.this.lambda$loadNewWatchFace$1(imageView, (Throwable) obj);
                }
            });
        } else {
            setDownloadWatchFace(imageView, url);
        }
    }

    private void renderAIWatchFace(WatchFaceModel watchFaceModel, b bVar, ImageView imageView) {
        bVar.setGone(R.id.tv_watch_face_name, true);
        bVar.setVisible(R.id.btn_watch_face_edit, true);
        bVar.setText(R.id.btn_watch_face_edit, com.moyoung.dafit.module.common.utils.d.get().getString(R.string.ai_watch_face));
        String string = g.getInstance().getString(AIPictureModel.SENT_AI_PICTURE_PATH, "");
        if (TextUtils.isEmpty(string)) {
            bVar.setVisible(R.id.iv_center_logo, true);
            setDefaultWatchFace(imageView, 0);
            imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC);
            return;
        }
        watchFaceModel.setUrl(string);
        com.orhanobut.logger.f.d("loadAIWatchFace: " + string);
        bVar.setVisible(R.id.iv_center_logo, false);
        imageView.clearColorFilter();
        LinearLayout linearLayout = (LinearLayout) bVar.getView(R.id.ll_hisilicon_label);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            renderHisiliconLabel(bVar, CRPWatchFaceType.AI_WATCH_FACE);
        } else if (com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli707()) {
            renderJieliLabel(bVar.getDataBinding().includeJieliPointerPreview, CRPWatchFaceType.AI_WATCH_FACE);
        } else {
            linearLayout.setVisibility(8);
        }
        File file = new File(string);
        String valueOf = String.valueOf(file.lastModified());
        if (linearLayout.getTag() == null || !valueOf.equals(linearLayout.getTag())) {
            Picasso.get().load(file).resize(getWatchFaceWidth(this.watchFace), getWatchFaceHeight(this.watchFace)).centerCrop().memoryPolicy(MemoryPolicy.NO_CACHE, new MemoryPolicy[0]).placeholder(R.color.black).into(imageView);
        } else {
            Picasso.get().load(file).resize(getWatchFaceWidth(this.watchFace), getWatchFaceHeight(this.watchFace)).centerCrop().placeholder(R.color.black).into(imageView);
        }
        linearLayout.setTag(valueOf);
    }

    private void renderHisiliconLabel(b bVar, CRPWatchFaceType cRPWatchFaceType) {
        final LayoutItemWatchFaceHisiliconLabelBinding layoutItemWatchFaceHisiliconLabelBinding = bVar.getDataBinding().includeHisiliconLabel;
        layoutItemWatchFaceHisiliconLabelBinding.rlHisiliconLabelRoot.setVisibility(0);
        layoutItemWatchFaceHisiliconLabelBinding.llHisiliconLabel.setVisibility(8);
        layoutItemWatchFaceHisiliconLabelBinding.ivHisiliconClockPointer.setVisibility(8);
        if (y1.c.getTimeStyle(cRPWatchFaceType) == CRPWatchFaceTimeStyle.CLASS) {
            layoutItemWatchFaceHisiliconLabelBinding.ivHisiliconClockPointer.setVisibility(0);
            return;
        }
        layoutItemWatchFaceHisiliconLabelBinding.llHisiliconLabel.setVisibility(0);
        layoutItemWatchFaceHisiliconLabelBinding.ivWatchFaceTime.setImageResource(j.getWatchFaceTimeResources());
        final CRPHisiliconWatchFaceLayoutInfo newWatchFaceLayoutInfo = z1.j.getNewWatchFaceLayoutInfo(cRPWatchFaceType);
        setWatchFaceContent(layoutItemWatchFaceHisiliconLabelBinding.ivWatchFaceTimeTop, newWatchFaceLayoutInfo.getTimeTopContent());
        setWatchFaceContent(layoutItemWatchFaceHisiliconLabelBinding.ivWatchFaceTimeBottom, newWatchFaceLayoutInfo.getTimeBottomContent());
        int textColor = newWatchFaceLayoutInfo.getTextColor();
        com.orhanobut.logger.f.d("textColorInt: " + textColor);
        renderHisiliconLabelColor(textColor, layoutItemWatchFaceHisiliconLabelBinding.ivWatchFaceTime);
        renderHisiliconLabelColor(textColor, layoutItemWatchFaceHisiliconLabelBinding.ivWatchFaceTimeTop);
        renderHisiliconLabelColor(textColor, layoutItemWatchFaceHisiliconLabelBinding.ivWatchFaceTimeBottom);
        if (newWatchFaceLayoutInfo.getX() == -1 && newWatchFaceLayoutInfo.getY() == -1) {
            com.orhanobut.logger.f.d("layoutInfo.getX() == -1");
            layoutItemWatchFaceHisiliconLabelBinding.llHisiliconLabel.setCenterInHorizontal(true);
            return;
        }
        CRPWatchFaceElementInfo cRPWatchFaceElementInfo = z1.j.getCRPWatchFaceElementInfo();
        final int screenHeight = i.getScreenHeight();
        Log.d("watchFaceHeight: ", String.valueOf(screenHeight));
        int y7 = newWatchFaceLayoutInfo.getY();
        if (newWatchFaceLayoutInfo.getTimeTopContent() > 0) {
            y7 -= cRPWatchFaceElementInfo.getDateHeight();
        }
        final int min = Math.min(Math.max(y7, 14), newWatchFaceLayoutInfo.getTimeBottomContent() > 0 ? ((screenHeight - 14) - cRPWatchFaceElementInfo.getDateHeight()) - cRPWatchFaceElementInfo.getTimeHeight() : screenHeight - 14);
        final RelativeLayout relativeLayout = (RelativeLayout) bVar.getView(R.id.rl_watch_face);
        relativeLayout.post(new Runnable() { // from class: com.crrepa.band.my.home.device.adapter.d
            @Override // java.lang.Runnable
            public final void run() {
                WatchFaceAdapter.this.lambda$renderHisiliconLabel$4(relativeLayout, screenHeight, newWatchFaceLayoutInfo, min, layoutItemWatchFaceHisiliconLabelBinding);
            }
        });
    }

    private void renderHisiliconLabelColor(@ColorInt int i8, ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            DrawableCompat.setTint(DrawableCompat.wrap(drawable).mutate(), i8);
            imageView.post(new a(imageView));
        }
    }

    private void renderJieliLabel(final LayoutNewWatchFacePointerPreviewBinding layoutNewWatchFacePointerPreviewBinding, final CRPWatchFaceType cRPWatchFaceType) {
        layoutNewWatchFacePointerPreviewBinding.rlPointerLabelRoot.setVisibility(0);
        final f fVar = new f(layoutNewWatchFacePointerPreviewBinding, true);
        layoutNewWatchFacePointerPreviewBinding.rlPointerLabelRoot.post(new Runnable() { // from class: com.crrepa.band.my.home.device.adapter.e
            @Override // java.lang.Runnable
            public final void run() {
                WatchFaceAdapter.this.lambda$renderJieliLabel$3(layoutNewWatchFacePointerPreviewBinding, cRPWatchFaceType, fVar);
            }
        });
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    private void renderNewCustomImg(WatchFaceModel watchFaceModel, ImageView imageView) {
        String str;
        WatchFace watchFace = getWatchFace();
        if (watchFace != null) {
            str = watchFace.getMd5();
            Log.d("renderNewCustomImg", "md5: " + str + " watchFaceW: " + watchFace.getWidth() + " watchFaceH: " + watchFace.getHeight());
        } else {
            str = null;
        }
        BaseBandModel baseBandModel = this.connectBand;
        if (baseBandModel instanceof CustomizeBandModel) {
            String bandWatchFaceUrl = ((CustomizeBandModel) baseBandModel).getBandWatchFaceUrl(watchFaceModel.getWatchFaceId());
            watchFaceModel.setUrl(bandWatchFaceUrl);
            Log.d("renderNewCustomImg", "url: " + bandWatchFaceUrl);
        }
        com.orhanobut.logger.f.d("md5: " + str);
        List<String> sentToBandPhotoNameList = m.getSentToBandPhotoNameList();
        if (!x0.isNotEmpty(sentToBandPhotoNameList)) {
            setDefaultWatchFace(imageView, watchFaceModel.getWatchFaceId());
            Log.e("renderNewCustomImg", "setDefaultWatchFace");
            return;
        }
        File file = new File(i.getCustomWatchFaceImgDir() + sentToBandPhotoNameList.get(m.getSentToBandSelectedIndex()) + ".png");
        StringBuilder sb = new StringBuilder();
        sb.append("file: ");
        sb.append(file);
        Log.d("renderNewCustomImg", sb.toString());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Log.d("renderNewCustomImg", "Image dimensions: " + options.outWidth + "x" + options.outHeight);
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (decodeFile != null) {
            imageView.setImageBitmap(decodeFile);
        } else {
            Picasso.get().load(file).into(imageView);
            Log.e("renderNewCustomImg", "Failed to decode bitmap");
        }
    }

    private void renderNewCustomWatchFace(@NonNull b bVar, WatchFaceModel watchFaceModel, RoundedImageView roundedImageView) {
        bVar.setGone(R.id.tv_watch_face_name, true);
        bVar.setVisible(R.id.btn_watch_face_edit, true);
        bVar.setText(R.id.btn_watch_face_edit, com.moyoung.dafit.module.common.utils.d.get().getString(R.string.device_custom_watch_face_title));
        renderNewCustomImg(watchFaceModel, roundedImageView);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            renderHisiliconLabel(bVar, CRPWatchFaceType.PHOTO_WATCH_FACE);
        } else {
            renderJieliLabel(bVar.getDataBinding().includeJieliPointerPreview, CRPWatchFaceType.PHOTO_WATCH_FACE);
        }
    }

    private void renderVideoWatchFace(WatchFaceModel watchFaceModel, b bVar, ImageView imageView) {
        bVar.setVisible(R.id.iv_center_logo, false);
        bVar.setGone(R.id.tv_watch_face_name, true);
        bVar.setVisible(R.id.btn_watch_face_edit, true);
        bVar.setText(R.id.btn_watch_face_edit, com.moyoung.dafit.module.common.utils.d.get().getString(R.string.device_video_watch_face_title));
        renderHisiliconLabel(bVar, CRPWatchFaceType.VIDEO_WATCH_FACE);
        int watchFaceId = watchFaceModel.getWatchFaceId();
        BaseBandModel baseBandModel = this.connectBand;
        if (baseBandModel instanceof CustomizeBandModel) {
            watchFaceModel.setUrl(((CustomizeBandModel) baseBandModel).getBandWatchFaceUrl(watchFaceId));
        }
        String videoWatchFacePreviewImgPath = LocalVideoModel.getVideoWatchFacePreviewImgPath();
        com.orhanobut.logger.f.d("loadVideoWatchFace: " + videoWatchFacePreviewImgPath);
        File file = new File(videoWatchFacePreviewImgPath);
        if (!file.exists() || file.length() <= 0) {
            setDefaultWatchFace(imageView, watchFaceId);
            return;
        }
        imageView.clearColorFilter();
        String valueOf = String.valueOf(file.lastModified());
        LinearLayout linearLayout = (LinearLayout) bVar.getView(R.id.ll_hisilicon_label);
        if (linearLayout.getTag() == null || !valueOf.equals(linearLayout.getTag())) {
            Picasso.get().load(file).memoryPolicy(MemoryPolicy.NO_CACHE, new MemoryPolicy[0]).placeholder(R.color.black).into(imageView);
        } else {
            Picasso.get().load(file).placeholder(R.color.black).into(imageView);
        }
        linearLayout.setTag(valueOf);
    }

    private void setCustomizeWatchFace(ImageView imageView, int i8) {
        WatchFace watchFace = getWatchFace();
        String md5 = watchFace != null ? watchFace.getMd5() : null;
        com.orhanobut.logger.f.d("md5: " + md5);
        int presetWatchFaceIndex = BandPresetWatchFaceProvider.getPresetWatchFaceIndex(md5);
        if (-1 < presetWatchFaceIndex) {
            Picasso.get().load(BandPresetWatchFaceProvider.DEFAULT_WATCH_FACE_LIST[presetWatchFaceIndex]).resize(getWatchFaceWidth(watchFace), getWatchFaceHeight(watchFace)).centerCrop().into(imageView);
            return;
        }
        File watchFaceFile = j.getWatchFaceFile(i8, md5);
        if (watchFaceFile == null || !watchFaceFile.exists()) {
            setDefaultWatchFace(imageView, i8);
            return;
        }
        com.orhanobut.logger.f.d("watchFaceFile: " + watchFaceFile.getPath());
        Picasso.get().load(watchFaceFile).into(imageView);
    }

    private void setCustomizeWatchFaceLayout(BaseViewHolder baseViewHolder, int i8, boolean z7, boolean z8) {
        WatchFace watchFace = getWatchFace();
        if (watchFace == null) {
            watchFace = j.getDefaultWatchFace(this.connectBand.getBroadcastName(), i8);
        } else {
            this.watchFaceDaoProxy.refresh(watchFace);
        }
        final LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R.id.ll_watch_face_content);
        linearLayout.setVisibility(0);
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_watch_face_time);
        ImageView imageView2 = (ImageView) baseViewHolder.getView(R.id.iv_watch_face_time_top);
        ImageView imageView3 = (ImageView) baseViewHolder.getView(R.id.iv_watch_face_time_bottom);
        final ImageView imageView4 = (ImageView) baseViewHolder.getView(R.id.iv_watch_face);
        imageView.setImageResource(j.getWatchFaceTimeResources());
        setWatchFaceTimePosition(linearLayout, watchFace.getTimePosition().intValue(), z7, z8);
        imageView4.post(new Runnable() { // from class: com.crrepa.band.my.home.device.adapter.a
            @Override // java.lang.Runnable
            public final void run() {
                WatchFaceAdapter.this.lambda$setCustomizeWatchFaceLayout$2(imageView4, linearLayout);
            }
        });
        setWatchFaceContent(imageView2, watchFace.getTimeTopContent().intValue());
        setWatchFaceContent(imageView3, watchFace.getTimeBottomComtent().intValue());
        int watchFaceTextColorInt = j.getWatchFaceTextColorInt(watchFace.getTextColor().intValue());
        renderHisiliconLabelColor(watchFaceTextColorInt, imageView);
        renderHisiliconLabelColor(watchFaceTextColorInt, imageView2);
        renderHisiliconLabelColor(watchFaceTextColorInt, imageView3);
    }

    private void setDefaultDownloadWatchFace(ImageView imageView) {
        setDefaultWatchFace(imageView, 0);
        imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC);
    }

    private void setDefaultWatchFace(ImageView imageView, int i8) {
        BaseBandModel baseBandModel = this.connectBand;
        if (baseBandModel instanceof CustomizeBandModel) {
            ((CustomizeBandModel) baseBandModel).loadBandWatchFace(i8, imageView);
        }
    }

    private void setDownloadWatchFace(ImageView imageView, String str) {
        imageView.clearColorFilter();
        BaseBandModel baseBandModel = this.connectBand;
        if (baseBandModel instanceof CustomizeBandModel) {
            ((CustomizeBandModel) baseBandModel).loadWatchFaceStorePreview(imageView, str);
        }
    }

    private void setEditWatchFace(BaseViewHolder baseViewHolder) {
        baseViewHolder.setGone(R.id.tv_watch_face_name, true);
        baseViewHolder.setVisible(R.id.btn_watch_face_edit, true);
        baseViewHolder.setText(R.id.btn_watch_face_edit, com.moyoung.dafit.module.common.utils.d.get().getString(R.string.edit));
    }

    private void setWatchFaceContent(ImageView imageView, int i8) {
        int watchFaceContentResources = j.getWatchFaceContentResources(i8);
        if (watchFaceContentResources < 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(watchFaceContentResources);
        }
    }

    private void setWatchFaceName(BaseViewHolder baseViewHolder, int i8) {
        baseViewHolder.setGone(R.id.btn_watch_face_edit, true);
        baseViewHolder.setVisible(R.id.tv_watch_face_name, true);
        baseViewHolder.setText(R.id.tv_watch_face_name, com.moyoung.dafit.module.common.utils.d.get().getString(R.string.watch_face) + l.SPACE + i8);
    }

    private void setWatchFaceNameInStore(BaseViewHolder baseViewHolder, int i8) {
        baseViewHolder.setGone(R.id.btn_watch_face_edit, true);
        baseViewHolder.setVisible(R.id.tv_watch_face_name, true);
        baseViewHolder.setText(R.id.tv_watch_face_name, com.moyoung.dafit.module.common.utils.d.get().getString(R.string.watch_face) + l.SPACE + i8);
    }

    private void setWatchFaceStore(BaseViewHolder baseViewHolder) {
        baseViewHolder.setGone(R.id.tv_watch_face_name, true);
        baseViewHolder.setVisible(R.id.btn_watch_face_edit, true);
        baseViewHolder.setText(R.id.btn_watch_face_edit, com.moyoung.dafit.module.common.utils.d.get().getString(R.string.face_gallery));
    }

    private void setWatchFaceTimePosition(LinearLayout linearLayout, int i8, boolean z7, boolean z8) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (i8 == 0) {
            layoutParams.removeRule(12);
            layoutParams.addRule(10);
        } else {
            layoutParams.removeRule(10);
            layoutParams.addRule(12);
        }
        if (z7) {
            layoutParams.addRule(14, 1);
            linearLayout.setGravity(17);
        } else {
            layoutParams.addRule(21);
            linearLayout.setGravity(GravityCompat.END);
            if (z8) {
                layoutParams.setMarginEnd(o.dp2px(com.moyoung.dafit.module.common.utils.d.get(), 20.0f));
            }
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    private void showCustomizeWatchFaceLayout(BaseViewHolder baseViewHolder, boolean z7, boolean z8, ImageView imageView, int i8) {
        com.orhanobut.logger.f.d("showCustomizeWatchFaceLayout: " + i8);
        setCustomizeWatchFace(imageView, i8);
        setCustomizeWatchFaceLayout(baseViewHolder, i8, z7, z8);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i8, @NonNull List list) {
        onBindViewHolder2((b) viewHolder, i8, (List<Object>) list);
    }

    public void resetBandInfo() {
        this.connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        this.circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
        this.roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
    }

    public void setDisplayWatchFaceIndex(int i8) {
        this.displayWatchFaceIndex = i8;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewData(@Nullable List<WatchFaceModel> list) {
        int i8;
        if (list != null && (i8 = this.displayWatchFaceIndex) != -1 && i8 <= list.size()) {
            com.orhanobut.logger.f.d("WatchFaceAdapter setNewData: " + list.toString());
            for (WatchFaceModel watchFaceModel : list) {
                watchFaceModel.setChecked(watchFaceModel.getIndex() == this.displayWatchFaceIndex);
            }
        }
        super.setNewData(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull b bVar, WatchFaceModel watchFaceModel) {
        com.orhanobut.logger.f.d("convert watchFace: " + watchFaceModel.toString());
        if (this.connectBand == null) {
            com.orhanobut.logger.f.d("convert watchFace: connectBand == null");
            return;
        }
        RoundedImageView roundedImageView = (RoundedImageView) bVar.getView(R.id.iv_watch_face);
        roundedImageView.setBorderWidth(R.dimen.watch_face_border_width);
        roundedImageView.setSecondBorderWidth(R.dimen.watch_face_box_width);
        roundedImageView.setBorderColor(-16777216);
        bVar.setVisible(R.id.iv_photo_picture, false);
        bVar.setVisible(R.id.ll_watch_face_content, false);
        bVar.binding.includeHisiliconLabel.rlHisiliconLabelRoot.setVisibility(8);
        bVar.binding.includeJieliPointerPreview.rlPointerLabelRoot.setVisibility(8);
        if (watchFaceModel.isChecked()) {
            roundedImageView.setSecondBorderColor(ContextCompat.getColor(roundedImageView.getContext(), R.color.color_watch_face_border_h));
        } else {
            roundedImageView.setSecondBorderColor(ContextCompat.getColor(roundedImageView.getContext(), R.color.color_watch_face_border_n));
        }
        if (this.circleScreen) {
            roundedImageView.setOval(true);
        } else if (this.roundedRectangleScreen) {
            roundedImageView.setCornerRadius(this.connectBand.getRoundedRadius());
        } else {
            roundedImageView.setBorderCornerRadius(this.connectBand.getRoundedRadius());
        }
        roundedImageView.setTag(watchFaceModel.getUrl());
        int watchFaceId = watchFaceModel.getWatchFaceId();
        boolean isCustomize = watchFaceModel.isCustomize();
        WatchFaceModel.WatchFaceType watchFaceType = watchFaceModel.getWatchFaceType();
        WatchFaceModel.WatchFaceType watchFaceType2 = WatchFaceModel.WatchFaceType.WATCH_FACE_AI;
        if (watchFaceType == watchFaceType2) {
            renderAIWatchFace(watchFaceModel, bVar, roundedImageView);
        } else if (watchFaceModel.getWatchFaceType() == WatchFaceModel.WatchFaceType.WATCH_FACE_VIDEO) {
            renderVideoWatchFace(watchFaceModel, bVar, roundedImageView);
        } else if (watchFaceModel.getWatchFaceType() == WatchFaceModel.WatchFaceType.WATCH_FACE_PHOTO) {
            renderNewCustomWatchFace(bVar, watchFaceModel, roundedImageView);
        } else if (isCustomize) {
            setEditWatchFace(bVar);
            showCustomizeWatchFaceLayout(bVar, this.circleScreen, this.roundedRectangleScreen, roundedImageView, watchFaceId);
        } else if (watchFaceModel.getWatchFaceType() == WatchFaceModel.WatchFaceType.WATCH_FACE_DEFAULT) {
            setDefaultWatchFace(roundedImageView, watchFaceId);
            setWatchFaceName(bVar, watchFaceModel.getIndex());
        } else if (watchFaceModel.getWatchFaceType() == WatchFaceModel.WatchFaceType.WATCH_FACE_STORE) {
            if (!com.crrepa.band.my.ble.band.utils.a.getInstance().isMultipleDownloadWatchFace()) {
                loadNewWatchFace(watchFaceModel, roundedImageView);
                setWatchFaceStore(bVar);
            } else if (watchFaceModel.getWatchFaceId() == 65535) {
                setWatchFaceStore(bVar);
            } else {
                loadNewWatchFace(watchFaceModel, roundedImageView);
                setWatchFaceNameInStore(bVar, watchFaceModel.getIndex());
            }
        }
        boolean isEmptyWatchFace = DefaultWatchFaceProvider.isEmptyWatchFace(watchFaceId);
        if (isEmptyWatchFace) {
            setDefaultDownloadWatchFace(roundedImageView);
        } else {
            roundedImageView.setColorFilter(-16777216, PorterDuff.Mode.DST_OVER);
        }
        if (watchFaceModel.getWatchFaceType() != watchFaceType2) {
            bVar.setVisible(R.id.iv_center_logo, false);
        } else if (TextUtils.isEmpty(watchFaceModel.getUrl())) {
            setDefaultDownloadWatchFace(roundedImageView);
        }
        bVar.setVisible(R.id.iv_add_watch_face, isEmptyWatchFace);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public b createBaseViewHolder(View view) {
        return new b(view);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull b bVar, int i8, @NonNull List list) {
        onBindViewHolder2(bVar, i8, (List<Object>) list);
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(@NonNull b bVar, int i8, @NonNull List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder((WatchFaceAdapter) bVar, i8, list);
            return;
        }
        RoundedImageView roundedImageView = (RoundedImageView) bVar.getView(R.id.iv_watch_face);
        if (getData().get(i8).isChecked()) {
            roundedImageView.setSecondBorderColor(ContextCompat.getColor(roundedImageView.getContext(), R.color.color_watch_face_border_h));
        } else {
            roundedImageView.setSecondBorderColor(ContextCompat.getColor(roundedImageView.getContext(), R.color.color_watch_face_border_n));
        }
    }
}
