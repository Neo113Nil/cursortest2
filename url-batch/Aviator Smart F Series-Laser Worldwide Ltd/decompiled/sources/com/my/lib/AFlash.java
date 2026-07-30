package com.my.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import cn.hutool.core.util.g1;
import com.my.lib.AFlash;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.TimeoutConfig;
import com.my.lib.data.WatchInfo;
import com.my.lib.enums.Region;
import java.io.ByteArrayOutputStream;
import java.io.File;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFlash {
    public static final Companion Companion = new Companion(null);
    private static final y5.f instance$delegate;
    private TimeoutConfig timeConfig = new TimeoutConfig(60, 60, 60);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final AFlash getInstance() {
            return (AFlash) AFlash.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(new f6.a() { // from class: i5.a
            @Override // f6.a
            public final Object invoke() {
                AFlash instance_delegate$lambda$0;
                instance_delegate$lambda$0 = AFlash.instance_delegate$lambda$0();
                return instance_delegate$lambda$0;
            }
        });
        instance$delegate = lazy;
    }

    private AFlash() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AFlash instance_delegate$lambda$0() {
        return new AFlash();
    }

    public final void analyzeData(Context context, String requestId, String wid, String str, JSONObject jsonObject, f6.q onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(jsonObject, "jsonObject");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(jsonObject, "jsonObject");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((T) T.f15359a.getValue()).getClass();
        T.a(context, timeoutConfig, requestId, wid, str, jsonObject, onSuccess, onFailure);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x013d, code lost:
    
        if (r26.equals(cn.hutool.core.util.g1.URL_PROTOCOL_FILE) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014c, code lost:
    
        if (r26.equals("img") == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void chat(Context context, String requestId, String wid, String str, String code, String inputType, String str2, String str3, File file, String str4, String str5, String str6, f6.v onSuccess, f6.p onFailure) {
        String str7;
        String str8;
        String str9;
        byte[] byteArray;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(code, "code");
        kotlin.jvm.internal.s.checkNotNullParameter(inputType, "inputType");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(code, "code");
        kotlin.jvm.internal.s.checkNotNullParameter(inputType, "inputType");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((C0420l) C0420l.f15378a.getValue()).getClass();
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(code, "code");
        kotlin.jvm.internal.s.checkNotNullParameter(inputType, "inputType");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (wid.length() <= 0) {
            throw new IllegalArgumentException("wid cannot be null or empty");
        }
        if (code.length() <= 0) {
            throw new IllegalArgumentException("code cannot be empty");
        }
        if (inputType.length() <= 0) {
            throw new IllegalArgumentException("inputType cannot be empty");
        }
        int hashCode = inputType.hashCode();
        if (hashCode == 104387) {
            str7 = str5;
            str8 = str6;
            str9 = "toString(...)";
        } else {
            if (hashCode != 3143036) {
                if (hashCode != 3556653) {
                    if (hashCode == 93166550 && inputType.equals("audio")) {
                        str7 = str5;
                        str8 = str6;
                        str9 = "toString(...)";
                        if (str4 == null || str4.length() == 0) {
                            AbstractC0410b.a(ErrorCode.PARAMETER_ERROR, "fileFormat cannot be empty", onFailure, requestId);
                            return;
                        }
                        if (file == null || !file.exists()) {
                            AbstractC0410b.a(ErrorCode.PARAMETER_ERROR, "file does not exist", onFailure, requestId);
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("bycDLMJcn", inputType);
                        jSONObject.put("TtfvskEpxvX", code);
                        jSONObject.put("lEensf", "false");
                        jSONObject.put("VzaCwgEvm", str2 == null ? "" : str2);
                        jSONObject.put("bycDLElapMTrR", str7);
                        jSONObject.put("hFgyMmWNwynlTn", str8);
                        int hashCode2 = inputType.hashCode();
                        if (hashCode2 != 104387) {
                            if (hashCode2 != 3143036) {
                                if (hashCode2 == 93166550 && inputType.equals("audio")) {
                                    String a8 = AbstractC0425q.a(file);
                                    if (a8 == null) {
                                        AbstractC0410b.a(ErrorCode.UNKNOWN_ERROR, "file processing error", onFailure, requestId);
                                        return;
                                    } else {
                                        jSONObject.put("TFQrGMJcn", str4);
                                        jSONObject.put("TFQrGuJgn", a8);
                                    }
                                }
                            } else if (inputType.equals(g1.URL_PROTOCOL_FILE)) {
                                String a9 = AbstractC0425q.a(file);
                                if (a9 == null) {
                                    AbstractC0410b.a(ErrorCode.UNKNOWN_ERROR, "file processing error", onFailure, requestId);
                                    return;
                                } else {
                                    jSONObject.put("YtYnlrAR", str4);
                                    jSONObject.put("YtYnTrER", a9);
                                }
                            }
                        } else if (inputType.equals("img")) {
                            Bitmap bitmap = BitmapFactory.decodeFile(file.getPath());
                            kotlin.jvm.internal.s.checkNotNullExpressionValue(bitmap, "decodeFile(...)");
                            kotlin.jvm.internal.s.checkNotNullParameter(bitmap, "bitmap");
                            Pair pair = y5.h.to(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
                            if (bitmap.getWidth() > 300.0f || bitmap.getHeight() > 300.0f) {
                                float min = Math.min(300.0f / ((Number) pair.getFirst()).floatValue(), 300.0f / ((Number) pair.getSecond()).floatValue());
                                Pair pair2 = y5.h.to(Integer.valueOf((int) (((Number) pair.getFirst()).floatValue() * min)), Integer.valueOf((int) (((Number) pair.getSecond()).floatValue() * min)));
                                Bitmap createBitmap = Bitmap.createBitmap(((Number) pair2.getFirst()).intValue(), ((Number) pair2.getSecond()).intValue(), Bitmap.Config.ARGB_8888);
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                                Canvas canvas = new Canvas(createBitmap);
                                Matrix matrix = new Matrix();
                                matrix.postScale(min, min);
                                canvas.drawBitmap(bitmap, matrix, new Paint());
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                                byteArray = byteArrayOutputStream.toByteArray();
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                            } else {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
                                byteArray = byteArrayOutputStream2.toByteArray();
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                            }
                            String a10 = AbstractC0425q.a(byteArray);
                            jSONObject.put("bxTcQip", str4);
                            jSONObject.put("bxTKQmp", a10);
                        }
                        String name = file.getName();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(name, "getName(...)");
                        String jSONObject2 = jSONObject.toString();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, str9);
                        C0420l.a(context, timeoutConfig, requestId, wid, str, name, jSONObject2, onSuccess, onFailure);
                        return;
                    }
                } else if (inputType.equals("text")) {
                    if (str3 == null || str3.length() == 0) {
                        AbstractC0410b.a(ErrorCode.PARAMETER_ERROR, "textContent cannot be empty", onFailure, requestId);
                        return;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("bycDLMJcn", inputType);
                    jSONObject3.put("TtfvskEpxvX", code);
                    jSONObject3.put("lEensf", "false");
                    jSONObject3.put("VzaCwgEvm", str2 == null ? "" : str2);
                    jSONObject3.put("bycDLElapMTrR", str5);
                    jSONObject3.put("hFgyMmWNwynlTn", str6);
                    jSONObject3.put("VzaCwgE", str3);
                    String jSONObject4 = jSONObject3.toString();
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject4, "toString(...)");
                    C0420l.a(context, timeoutConfig, requestId, wid, str, str3, jSONObject4, onSuccess, onFailure);
                    return;
                }
                AbstractC0410b.a(ErrorCode.PARAMETER_ERROR, "inputType does not match", onFailure, requestId);
                return;
            }
            str7 = str5;
            str8 = str6;
            str9 = "toString(...)";
        }
    }

    public final void fetchAgentList(Context context, String requestId, String wid, String language, int i8, int i9, f6.r onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        AbstractC0427s.a(context, timeoutConfig, requestId, wid, language, i8, i9, onSuccess, onFailure);
    }

    public final void fetchDrawStyleList(Context context, String requestId, String wid, String language, f6.p onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((C0424p) C0424p.f15381a.getValue()).getClass();
        C0424p.a(context, timeoutConfig, requestId, wid, language, onSuccess, onFailure);
    }

    public final TimeoutConfig getTimeConfig() {
        return this.timeConfig;
    }

    public final void initialize(Context context, Region region, WatchInfo[] watches, f6.l onSuccess, f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(region, "region");
        kotlin.jvm.internal.s.checkNotNullParameter(watches, "watches");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(region, "region");
        kotlin.jvm.internal.s.checkNotNullParameter(watches, "watches");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        new C0434z().a(context, region, watches, onSuccess, onFailure);
    }

    public final void meetingAudioFileUpload2Stt(Context context, String wid, String str, File audioFile, String fileFormat, String inputLanguage, f6.p onSuccess, f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(audioFile, "audioFile");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(inputLanguage, "inputLanguage");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(audioFile, "audioFile");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(inputLanguage, "inputLanguage");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((E) E.f15343a.getValue()).a(context, timeoutConfig, wid, str, audioFile, fileFormat, inputLanguage, onSuccess, onFailure);
    }

    public final void meetingSummary(Context context, String requestId, String wid, String str, f6.p onSuccess, f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((D) D.f15342a.getValue()).getClass();
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (wid.length() <= 0) {
            throw new IllegalArgumentException("wid cannot be null or empty");
        }
        if (requestId.length() == 0) {
            AbstractC0409a.a(ErrorCode.PARAMETER_ERROR, "requestId cannot be empty", onFailure);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bycDLMJcn", "text");
        jSONObject.put("TtfvskEpxvX", "jFhMuAeQZRSRENzVnZ");
        jSONObject.put("lEensf", "false");
        jSONObject.put("VzaCwgE", requestId);
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        D.a(context, timeoutConfig, wid, str, jSONObject2, onSuccess, onFailure);
    }

    public final void queryAllOrder(Context context, String wid, int i8, int i9, f6.l onSuccess, f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        C0434z.a(context, timeoutConfig, wid, i8, i9, onSuccess, onFailure);
    }

    public final void queryAllSubscriptionProducts(Context context, String wid, f6.l onSuccess, f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        C0434z.a(context, timeoutConfig, wid, onSuccess, onFailure);
    }

    public final void querySubscriptionInfo(Context context, String wid, String str, f6.l onSuccess, f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((J) J.f15347a.getValue()).getClass();
        J.a(context, timeoutConfig, wid, onSuccess, onFailure);
    }

    public final void setTimeConfig(TimeoutConfig timeoutConfig) {
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "<set-?>");
        this.timeConfig = timeoutConfig;
    }

    public final AFlash setTimeoutConfig(TimeoutConfig timeoutConfig) {
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.timeConfig = timeoutConfig;
        return this;
    }

    public final void speechToText(Context context, String requestId, String wid, String str, byte[] fileBytes, String fileFormat, String str2, f6.p onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(fileBytes, "fileBytes");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(fileBytes, "fileBytes");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((a0) a0.f15368a.getValue()).getClass();
        a0.a(context, timeoutConfig, requestId, wid, str, fileBytes, fileFormat, str2, onSuccess, onFailure);
    }

    public final void textChat(Context context, String requestId, String wid, String str, String inputContent, String contentId, String str2, f6.s onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(inputContent, "inputContent");
        kotlin.jvm.internal.s.checkNotNullParameter(contentId, "contentId");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(inputContent, "inputContent");
        kotlin.jvm.internal.s.checkNotNullParameter(contentId, "contentId");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((L) L.f15350a.getValue()).getClass();
        L.a(context, timeoutConfig, requestId, wid, str, inputContent, contentId, str2, onSuccess, onFailure);
    }

    public final void textDrawing(Context context, String requestId, String wid, String str, String inputContent, String imgFormat, int i8, String str2, f6.r onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(inputContent, "inputContent");
        kotlin.jvm.internal.s.checkNotNullParameter(imgFormat, "imgFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(inputContent, "inputContent");
        kotlin.jvm.internal.s.checkNotNullParameter(imgFormat, "imgFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((O) O.f15353a.getValue()).getClass();
        O.a(context, timeoutConfig, requestId, wid, str, inputContent, imgFormat, i8, str2, onSuccess, onFailure);
    }

    public final void textDrawingToFile(Context context, String requestId, String wid, String str, String inputContent, String str2, String imgFormat, int i8, String str3, f6.s onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(inputContent, "inputContent");
        kotlin.jvm.internal.s.checkNotNullParameter(imgFormat, "imgFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(inputContent, "inputContent");
        kotlin.jvm.internal.s.checkNotNullParameter(imgFormat, "imgFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((O) O.f15353a.getValue()).getClass();
        O.a(context, timeoutConfig, requestId, wid, str, inputContent, str2, imgFormat, i8, str3, onSuccess, onFailure);
    }

    public final void textToSpeech(Context context, String requestId, String wid, String str, String text, String fileFormat, f6.p onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((Q) Q.f15356a.getValue()).getClass();
        Q.a(context, timeoutConfig, requestId, wid, str, text, fileFormat, onSuccess, onFailure);
    }

    public final void voiceChat(Context context, String requestId, String wid, String str, byte[] fileBytes, String fileFormat, String contentId, String str2, f6.s onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(fileBytes, "fileBytes");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(contentId, "contentId");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(fileBytes, "fileBytes");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(contentId, "contentId");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((V) V.f15362a.getValue()).getClass();
        V.a(context, timeoutConfig, requestId, wid, str, fileBytes, fileFormat, contentId, str2, onSuccess, onFailure);
    }

    public final void voiceDrawing(Context context, String requestId, String wid, String str, File file, String audioFormat, String imgFormat, int i8, String str2, f6.r onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.s.checkNotNullParameter(audioFormat, "audioFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(imgFormat, "imgFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.s.checkNotNullParameter(audioFormat, "audioFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(imgFormat, "imgFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((Y) Y.f15365a.getValue()).getClass();
        Y.a(context, timeoutConfig, requestId, wid, str, file, audioFormat, imgFormat, i8, str2, onSuccess, onFailure);
    }

    public final void voiceDrawingWithFileBytes(Context context, String requestId, String wid, String str, byte[] fileBytes, String audioFormat, String str2, String imgFormat, int i8, String str3, f6.s onSuccess, f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(fileBytes, "fileBytes");
        kotlin.jvm.internal.s.checkNotNullParameter(audioFormat, "audioFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(imgFormat, "imgFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        TimeoutConfig timeoutConfig = this.timeConfig;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(fileBytes, "fileBytes");
        kotlin.jvm.internal.s.checkNotNullParameter(audioFormat, "audioFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(imgFormat, "imgFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        ((Y) Y.f15365a.getValue()).getClass();
        Y.a(context, timeoutConfig, requestId, wid, str, fileBytes, audioFormat, str2, imgFormat, i8, str3, onSuccess, onFailure);
    }
}
