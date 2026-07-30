package com.artillery.ctc;

import android.content.Context;
import androidx.annotation.Keep;
import com.artillery.ctc.base.AiGcBody;
import com.artillery.ctc.base.AsrModel;
import com.artillery.ctc.base.AsrSilkyModel;
import com.artillery.ctc.base.Audio2TextBody;
import com.artillery.ctc.base.Audio2TextBodyRaw;
import com.artillery.ctc.base.ChatBodyRequest;
import com.artillery.ctc.base.ChatPictureRequestBody;
import com.artillery.ctc.base.ChatRequestBody;
import com.artillery.ctc.base.FunctionType;
import com.artillery.ctc.base.GPTInternalBody;
import com.artillery.ctc.base.HealthDataBody;
import com.artillery.ctc.base.HealthQABody;
import com.artillery.ctc.base.KeyResult;
import com.artillery.ctc.base.LargeModel;
import com.artillery.ctc.base.NetChatBody;
import com.artillery.ctc.base.QueryBody;
import com.artillery.ctc.base.StockQueryBody;
import com.artillery.ctc.base.Text2AudioBody;
import com.artillery.ctc.base.Text2AudioSilkyBody;
import com.artillery.ctc.base.Text2MusicBody;
import com.artillery.ctc.base.TranslateBody;
import com.artillery.ctc.interfaces.IChatPictureCallback;
import com.artillery.ctc.interfaces.IRealTimeCall;
import com.artillery.ctc.interfaces.IResultCallback;
import com.artillery.ctc.interfaces.ISimpleCallback;
import f6.l;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.m0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;

@Keep
/* loaded from: classes.dex */
public final class CtHelper {
    public static final Companion Companion = new Companion(null);

    @Keep
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        @Keep
        public final CtHelper get() {
            return a.f669a.a();
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f669a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final CtHelper f670b = new CtHelper(null);

        public final CtHelper a() {
            return f670b;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f671a;

        static {
            int[] iArr = new int[FunctionType.values().length];
            try {
                iArr[FunctionType.AI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FunctionType.ST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FunctionType.STOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FunctionType.EYE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f671a = iArr;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements l {
        public c(Object obj) {
            super(1, obj, ISimpleCallback.class, "onSuccess", "onSuccess(Ljava/lang/String;)V", 0);
        }

        public final void a(String p02) {
            kotlin.jvm.internal.s.checkNotNullParameter(p02, "p0");
            ((ISimpleCallback) this.receiver).onSuccess(p02);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements l {
        public d(Object obj) {
            super(1, obj, ISimpleCallback.class, "onSuccess", "onSuccess(Ljava/lang/String;)V", 0);
        }

        public final void a(String p02) {
            kotlin.jvm.internal.s.checkNotNullParameter(p02, "p0");
            ((ISimpleCallback) this.receiver).onSuccess(p02);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class e extends Lambda implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f672a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ISimpleCallback iSimpleCallback) {
            super(1);
            this.f672a = iSimpleCallback;
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            this.f672a.onSuccess(it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements f6.a {
        public f(Object obj) {
            super(0, obj, IRealTimeCall.class, "onClose", "onClose()V", 0);
        }

        public final void a() {
            ((IRealTimeCall) this.receiver).onClose();
        }

        @Override // f6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return y5.w.INSTANCE;
        }
    }

    public /* synthetic */ class g extends FunctionReferenceImpl implements l {
        public g(Object obj) {
            super(1, obj, IRealTimeCall.class, "onResult", "onResult(Ljava/lang/String;)V", 0);
        }

        public final void a(String p02) {
            kotlin.jvm.internal.s.checkNotNullParameter(p02, "p0");
            ((IRealTimeCall) this.receiver).onResult(p02);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class h extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IRealTimeCall f673a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(IRealTimeCall iRealTimeCall) {
            super(0);
            this.f673a = iRealTimeCall;
        }

        public final void a() {
            this.f673a.onReady(CtHelper.Companion.get());
        }

        @Override // f6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return y5.w.INSTANCE;
        }
    }

    public /* synthetic */ CtHelper(o oVar) {
        this();
    }

    public static /* synthetic */ void aiStyle$default(CtHelper ctHelper, Integer num, String str, ISimpleCallback iSimpleCallback, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            num = null;
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        ctHelper.aiStyle(num, str, iSimpleCallback);
    }

    public static /* synthetic */ void aiStyleOverseas$default(CtHelper ctHelper, Integer num, String str, ISimpleCallback iSimpleCallback, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            num = null;
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        ctHelper.aiStyleOverseas(num, str, iSimpleCallback);
    }

    public static /* synthetic */ void startInternalAsr$default(CtHelper ctHelper, AsrSilkyModel asrSilkyModel, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            asrSilkyModel = null;
        }
        ctHelper.startInternalAsr(asrSilkyModel, lVar);
    }

    public static /* synthetic */ void startInternalAsrOverseas$default(CtHelper ctHelper, AsrSilkyModel asrSilkyModel, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            asrSilkyModel = null;
        }
        ctHelper.startInternalAsrOverseas(asrSilkyModel, lVar);
    }

    public static /* synthetic */ void startSimultaneousInterpretation$default(CtHelper ctHelper, boolean z7, z.a aVar, l lVar, l lVar2, l lVar3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            aVar = null;
        }
        ctHelper.startSimultaneousInterpretation(z7, aVar, lVar, lVar2, lVar3);
    }

    public static /* synthetic */ void startSoftAsrByMicrophone$default(CtHelper ctHelper, AsrSilkyModel asrSilkyModel, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            asrSilkyModel = null;
        }
        ctHelper.startSoftAsrByMicrophone(asrSilkyModel, lVar);
    }

    public static /* synthetic */ void writeAsrInternalByBytes$default(CtHelper ctHelper, byte[] bArr, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        ctHelper.writeAsrInternalByBytes(bArr, z7);
    }

    public static /* synthetic */ void writeAsrInternalByBytesOverseas$default(CtHelper ctHelper, byte[] bArr, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        ctHelper.writeAsrInternalByBytesOverseas(bArr, z7);
    }

    public static /* synthetic */ void writeRealTimeAsrByBytes$default(CtHelper ctHelper, byte[] bArr, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        ctHelper.writeRealTimeAsrByBytes(bArr, z7);
    }

    public static /* synthetic */ void writeSimultaneousInterpretationBytes$default(CtHelper ctHelper, boolean z7, byte[] bArr, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        ctHelper.writeSimultaneousInterpretationBytes(z7, bArr, z8);
    }

    public final void aiImageWithBody(ChatPictureRequestBody body, IChatPictureCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        ChatPictureRequestBody.ChatPictureParams chatPictureParams = body.params;
        if (chatPictureParams == null) {
            return;
        }
        String str = chatPictureParams.query;
        int i8 = chatPictureParams.height;
        int i9 = chatPictureParams.width;
        aiImageWithBodyV3Overseas(ChatPictureRequestBody.copy$default(body, new ChatPictureRequestBody.ChatOverseasPictureParams(str, null, null, Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(chatPictureParams.batchSize), null, chatPictureParams.style, null, null, null, null, null, null, 16198, null), null, null, null, null, 30, null), call);
    }

    public final void aiImageWithBodyOverseas(ChatPictureRequestBody body, IChatPictureCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        aiImageWithBodyV3Overseas(body, call);
    }

    public final void aiImageWithBodyV3(ChatPictureRequestBody body, IChatPictureCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().c(body, call);
    }

    public final void aiImageWithBodyV3Overseas(ChatPictureRequestBody body, IChatPictureCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().c(body, call);
    }

    public final void aiStyle(ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        aiStyleOverseas(3, null, call);
    }

    public final void aiStyleOverseas(Integer num, String str, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().a(num != null ? num.intValue() : 2, str, new d(call));
    }

    public final void audio2TextByJson(Audio2TextBody body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().a(body, call);
    }

    public final void audio2TextByRaw(Audio2TextBodyRaw body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().a(body, call);
    }

    public final void audio2TextRawOverseas(Audio2TextBodyRaw body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().b(body, call);
    }

    public final void cancelWithAigcInternal(String uuid) {
        kotlin.jvm.internal.s.checkNotNullParameter(uuid, "uuid");
        i.f797h.a().b(uuid);
    }

    public final void cancelWithAigcInternalOverseas(String uuid) {
        kotlin.jvm.internal.s.checkNotNullParameter(uuid, "uuid");
        i.f797h.a().c(uuid);
    }

    public final void cancelWithGPTInternal(String uuid) {
        kotlin.jvm.internal.s.checkNotNullParameter(uuid, "uuid");
        i.f797h.a().d(uuid);
    }

    public final void cancelWithGPTInternalOverseas(String uuid) {
        kotlin.jvm.internal.s.checkNotNullParameter(uuid, "uuid");
        i.f797h.a().e(uuid);
    }

    public final void chatWithBody(ChatRequestBody body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().a(body, call);
    }

    public final void chatWithBodyOverseas(ChatRequestBody body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().b(body, call);
    }

    public final void chatWithBodyOverseasNew(NetChatBody body, IResultCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().a(body, call);
    }

    public final void chatWithBodyV2(ChatBodyRequest body, ISimpleCallback block) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(block, "block");
        i.f797h.a().a(body, block);
    }

    public final void finishRealTimeAsr() {
        i.f797h.a().b();
    }

    public final void getLanguages(l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().a(onResult);
    }

    public final void getTtsLanguagesConfig(l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().b(onResult);
    }

    public final void healthAnalysisWithBody(QueryBody<HealthDataBody> body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().a(body, call);
    }

    public final void healthQAWithBody(QueryBody<HealthQABody> body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().b(body, call);
    }

    public final void initMagicWithParams(Context context, String mac, String channel, FunctionType type, l onErrorCall, l onSuccess) {
        Map mapOf;
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.s.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.s.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.s.checkNotNullParameter(onErrorCall, "onErrorCall");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        y.d.a(context);
        com.artillery.ctc.h.f791d.a().a(new KeyResult(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, mac, channel, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -786433, 7, null));
        i a8 = i.f797h.a();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("mac", mac);
        pairArr[1] = new Pair("channle", channel);
        int i8 = b.f671a[type.ordinal()];
        String str = "1";
        if (i8 != 1) {
            if (i8 == 2) {
                str = "2";
            } else if (i8 == 3) {
                str = "7";
            } else if (i8 == 4) {
                str = "6";
            }
        }
        pairArr[2] = new Pair("type", str);
        mapOf = m0.mapOf(pairArr);
        a8.a(context, mapOf, onSuccess, onErrorCall);
    }

    public final boolean isGPTDebugEnable() {
        return i.f797h.a().g();
    }

    public final boolean isOverseas() {
        return i.f797h.a().h();
    }

    public final void pauseSimultaneousInterpretation() {
        i.f797h.a().i();
    }

    public final List<LargeModel> queryLargeModelList() {
        return i.f797h.a().j();
    }

    public final void queryRecommend(StockQueryBody body, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().a(body, onResult);
    }

    public final void queryStock(StockQueryBody body, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().b(body, onResult);
    }

    public final void queryStockHistory(StockQueryBody body, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().c(body, onResult);
    }

    public final void resumeSimultaneousInterpretation(z.a body) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        i.f797h.a().a(body);
    }

    public final void setAsrModel(AsrModel model) {
        kotlin.jvm.internal.s.checkNotNullParameter(model, "model");
        i.f797h.a().a(model);
    }

    public final void setGPTDebugEnable(boolean z7) {
        i.f797h.a().a(z7);
    }

    public final void setInternalAsr(AsrSilkyModel asrModel) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrModel, "asrModel");
        i.f797h.a().a(asrModel);
    }

    public final void setInternalAsrOverseas(AsrSilkyModel asrModel) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrModel, "asrModel");
        i.f797h.a().b(asrModel);
    }

    public final void setLogcatEnable(boolean z7) {
        i.f797h.a().b(z7);
    }

    public final void startInternalAsr(AsrSilkyModel asrSilkyModel, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().a(asrSilkyModel, onResult);
    }

    public final void startInternalAsrOverseas(AsrSilkyModel asrSilkyModel, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().b(asrSilkyModel, onResult);
    }

    public final void startRealTimeAsr(InputStream inputStream, ISimpleCallback onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(inputStream, "inputStream");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().a(inputStream, new e(onResult));
    }

    public final void startSimultaneousInterpretation(boolean z7, z.a aVar, l asrCallback, l translateCallback, l ttsPathCallback) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrCallback, "asrCallback");
        kotlin.jvm.internal.s.checkNotNullParameter(translateCallback, "translateCallback");
        kotlin.jvm.internal.s.checkNotNullParameter(ttsPathCallback, "ttsPathCallback");
        if (z7) {
            i.f797h.a().b(aVar, asrCallback, translateCallback, ttsPathCallback);
        } else {
            startSimultaneousInterpretation(aVar, asrCallback, translateCallback, ttsPathCallback);
        }
    }

    public final void startSoftAsrByMicrophone(AsrSilkyModel asrSilkyModel, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().c(asrSilkyModel, onResult);
    }

    public final String startWithAigcInternal(AiGcBody body, l onAsrResult, IChatPictureCallback onAiGcResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onAsrResult, "onAsrResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onAiGcResult, "onAiGcResult");
        return i.f797h.a().a(body, onAsrResult, onAiGcResult);
    }

    public final String startWithAigcInternalOverseas(AiGcBody body, l onAsrResult, IChatPictureCallback onAiGcResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onAsrResult, "onAsrResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onAiGcResult, "onAiGcResult");
        return i.f797h.a().b(body, onAsrResult, onAiGcResult);
    }

    public final String startWithGPTInternal(GPTInternalBody body, l onAsrResult, l onAiResult, l onTtsResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onAsrResult, "onAsrResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onAiResult, "onAiResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onTtsResult, "onTtsResult");
        return i.f797h.a().a(body, onAsrResult, onAiResult, onTtsResult);
    }

    public final String startWithGPTInternalOverseas(GPTInternalBody body, l onAsrResult, l onAiResult, l onTtsResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onAsrResult, "onAsrResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onAiResult, "onAiResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onTtsResult, "onTtsResult");
        return i.f797h.a().b(body, onAsrResult, onAiResult, onTtsResult);
    }

    public final void stopInternalAsr() {
        i.f797h.a().k();
    }

    public final void stopInternalAsrOverseas() {
        i.f797h.a().l();
    }

    public final void stopRealTimeAsr() {
        i.f797h.a().m();
    }

    public final void stopSimultaneousInterpretation() {
        i.f797h.a().n();
    }

    public final void stopSoftAsrByMicrophone() {
        i.f797h.a().o();
    }

    public final void text2Audio(Text2AudioBody body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().a(body, call);
    }

    public final void text2AudioAfterPlay(Text2AudioBody body, l onFail) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onFail, "onFail");
        i.f797h.a().a(body, onFail);
    }

    public final void text2AudioAfterPlayOverseas(Text2AudioBody body, l onFail) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onFail, "onFail");
        i.f797h.a().b(body, onFail);
    }

    public final void text2AudioInternal(Text2AudioSilkyBody body, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().a(body, onResult);
    }

    public final void text2AudioInternalByHttpOverseas(Text2AudioSilkyBody body, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().b(body, onResult);
    }

    public final void text2AudioInternalOverseas(Text2AudioSilkyBody body, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().c(body, onResult);
    }

    public final void text2Music(Text2MusicBody body, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        i.f797h.a().a(body, onResult);
    }

    public final void translateWithBody(QueryBody<TranslateBody> body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().c(body, call);
    }

    public final void translateWithBodyOverseas(QueryBody<TranslateBody> body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().d(body, call);
    }

    public final void writeAsrInternalByBytes(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        i.f797h.a().a(bytes, z7);
    }

    public final void writeAsrInternalByBytesOverseas(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        i.f797h.a().b(bytes, z7);
    }

    public final void writeRealTimeAsrByBytes(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        i.f797h.a().c(bytes, z7);
    }

    public final void writeSimultaneousInterpretationBytes(boolean z7, byte[] bytes, boolean z8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        if (z7) {
            i.f797h.a().e(bytes, z8);
        } else {
            writeSimultaneousInterpretationBytes(bytes, z8);
        }
    }

    private CtHelper() {
    }

    public static /* synthetic */ void startSimultaneousInterpretation$default(CtHelper ctHelper, z.a aVar, l lVar, l lVar2, l lVar3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar = null;
        }
        ctHelper.startSimultaneousInterpretation(aVar, lVar, lVar2, lVar3);
    }

    public static /* synthetic */ void writeSimultaneousInterpretationBytes$default(CtHelper ctHelper, byte[] bArr, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        ctHelper.writeSimultaneousInterpretationBytes(bArr, z7);
    }

    public final void aiStyle(Integer num, String str, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().a(num != null ? num.intValue() : 2, str, new c(call));
    }

    public final void startRealTimeAsr(IRealTimeCall call) {
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        i.f797h.a().a(new f(call), new h(call), new g(call));
    }

    public final String startWithGPTInternal(GPTInternalBody body, l onAiResult, l onTtsResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onAiResult, "onAiResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onTtsResult, "onTtsResult");
        return i.f797h.a().a(body, (l) null, onAiResult, onTtsResult);
    }

    public final String startWithGPTInternalOverseas(GPTInternalBody body, l onAiResult, l onTtsResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onAiResult, "onAiResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onTtsResult, "onTtsResult");
        return i.f797h.a().b(body, (l) null, onAiResult, onTtsResult);
    }

    private final void startSimultaneousInterpretation(z.a aVar, l lVar, l lVar2, l lVar3) {
        i.f797h.a().a(aVar, lVar, lVar2, lVar3);
    }

    private final void writeSimultaneousInterpretationBytes(byte[] bArr, boolean z7) {
        i.f797h.a().d(bArr, z7);
    }
}
