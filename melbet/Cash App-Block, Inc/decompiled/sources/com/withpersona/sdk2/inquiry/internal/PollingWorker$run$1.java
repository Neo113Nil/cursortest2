package com.withpersona.sdk2.inquiry.internal;

import android.content.SharedPreferences;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider;
import com.withpersona.sdk2.inquiry.internal.PollingWorker;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession;
import com.withpersona.sdk2.inquiry.internal.network.ConversionsKt;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelperKt;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.Included;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionData;
import com.withpersona.sdk2.inquiry.network.dto.InquiryTemplateVersion;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryThemeManager;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RemoteFont;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.Response;
import okio.Okio;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class PollingWorker$run$1 extends SuspendLambda implements Function2 {
    public int I$0;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Ref$LongRef L$1;
    public Ref$LongRef L$2;
    public int label;
    public final /* synthetic */ PollingWorker this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
            try {
                iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingWorker$run$1(PollingWorker pollingWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pollingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollingWorker$run$1 pollingWorker$run$1 = new PollingWorker$run$1(this.this$0, continuation);
        pollingWorker$run$1.L$0 = obj;
        return pollingWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PollingWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:(1:19)|20|22|23|(5:218|219|220|221|222)(1:25)|26|27|28|29|(2:208|209)|31|(1:33)|34|35|36|37|38|39|40|(7:42|43|44|45|(2:181|(2:188|(4:190|(1:194)|192|193)(1:195))(4:183|(1:187)|185|186))(4:47|(1:49)|50|(17:52|(1:54)|55|(6:57|(4:60|(2:62|63)(1:65)|64|58)|66|67|(2:70|68)|71)(1:178)|72|73|(1:75)|76|(4:79|(5:85|86|(1:88)(1:92)|89|90)|91|77)|96|97|(5:99|(4:102|(3:104|105|106)(1:108)|107|100)|109|110|(3:116|(1:118)(1:120)|119))|121|(4:123|(4:126|(3:128|129|130)(1:132)|131|124)|133|134)(1:177)|(1:136)|137|(7:148|(1:150)|151|(1:153)(1:176)|154|(1:175)(2:156|(1:174)(2:158|(1:160)(2:172|173)))|(4:162|(1:166)|164|165)(1:167))(1:(1:142)(2:146|147)))(2:179|180))|168|(1:171)(5:170|10|11|12|(4:14|(2:16|(1:18))|7|8)(0)))|199|200) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:19|20|22|23|(5:218|219|220|221|222)(1:25)|26|27|28|29|(2:208|209)|31|(1:33)|34|35|36|37|38|39|40|(7:42|43|44|45|(2:181|(2:188|(4:190|(1:194)|192|193)(1:195))(4:183|(1:187)|185|186))(4:47|(1:49)|50|(17:52|(1:54)|55|(6:57|(4:60|(2:62|63)(1:65)|64|58)|66|67|(2:70|68)|71)(1:178)|72|73|(1:75)|76|(4:79|(5:85|86|(1:88)(1:92)|89|90)|91|77)|96|97|(5:99|(4:102|(3:104|105|106)(1:108)|107|100)|109|110|(3:116|(1:118)(1:120)|119))|121|(4:123|(4:126|(3:128|129|130)(1:132)|131|124)|133|134)(1:177)|(1:136)|137|(7:148|(1:150)|151|(1:153)(1:176)|154|(1:175)(2:156|(1:174)(2:158|(1:160)(2:172|173)))|(4:162|(1:166)|164|165)(1:167))(1:(1:142)(2:146|147)))(2:179|180))|168|(1:171)(5:170|10|11|12|(4:14|(2:16|(1:18))|7|8)(0)))|199|200) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:(1:218)|219|220|221|222) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x033d, code lost:
    
        if (r15.emit(r1, r30) == r10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0445, code lost:
    
        r18 = r9;
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0449, code lost:
    
        r4 = r13;
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x044d, code lost:
    
        r11 = r2;
        r18 = r9;
        r3 = r10;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0464, code lost:
    
        r11 = r2;
        r13 = r4;
        r18 = r9;
        r3 = r10;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x046b, code lost:
    
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x045b, code lost:
    
        r11 = r2;
        r18 = r9;
        r3 = r10;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x00e9, code lost:
    
        r1 = r16;
        r11 = r2;
        r13 = r4;
        r18 = r9;
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x046f, code lost:
    
        r16 = r0;
        r11 = r2;
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0099, code lost:
    
        if (r0.emit(r1, r30) == r10) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0429 -> B:10:0x042e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x047a -> B:11:0x0431). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Ref$LongRef ref$LongRef;
        Ref$LongRef ref$LongRef2;
        int i;
        long currentTimeMillis;
        long j;
        Ref$LongRef ref$LongRef3;
        FlowCollector flowCollector2;
        long j2;
        Ref$LongRef ref$LongRef4;
        Object obj2;
        RealDeviceIdProvider realDeviceIdProvider;
        CoroutineSingletons coroutineSingletons;
        Response response;
        long j3;
        CoroutineSingletons coroutineSingletons2;
        int i2;
        long j4;
        long j5;
        ArrayList arrayList;
        InquirySessionData inquirySessionData;
        PollingMode pollingMode;
        InquiryTemplateVersion.Attributes attributes;
        InquiryTemplateVersion.InquiryTheme theme;
        RealFontDownloader realFontDownloader;
        String str;
        PollingWorker pollingWorker = this.this$0;
        PollingMode pollingMode2 = pollingWorker.pollingMode;
        InquiryThemeManager inquiryThemeManager = pollingWorker.themeManager;
        RealDeviceIdProvider realDeviceIdProvider2 = pollingWorker.deviceIdProvider;
        String str2 = pollingWorker.sessionToken;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str3 = null;
        switch (this.label) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                StaticTemplateSession staticTemplateSession = pollingWorker.fallbackModeManager.currentSession;
                if (staticTemplateSession != null) {
                    PollingWorker.Response.Success success = new PollingWorker.Response.Success(staticTemplateSession.currentStepAsInquiryState$inquiry_internal_release());
                    this.label = 1;
                    break;
                } else {
                    Ref$LongRef ref$LongRef5 = new Ref$LongRef();
                    ref$LongRef5.element = 1000L;
                    Ref$LongRef ref$LongRef6 = new Ref$LongRef();
                    ref$LongRef6.element = 90000L;
                    flowCollector = flowCollector3;
                    ref$LongRef = ref$LongRef5;
                    ref$LongRef2 = ref$LongRef6;
                    i = 0;
                    currentTimeMillis = System.currentTimeMillis();
                    if (System.currentTimeMillis() - currentTimeMillis < ref$LongRef2.element) {
                        try {
                        } catch (IOException unused) {
                            j2 = currentTimeMillis;
                            realDeviceIdProvider = realDeviceIdProvider2;
                            coroutineSingletons = coroutineSingletons3;
                            coroutineSingletons3 = coroutineSingletons;
                            currentTimeMillis = j2;
                            realDeviceIdProvider2 = realDeviceIdProvider;
                            str3 = null;
                            if (System.currentTimeMillis() - currentTimeMillis < ref$LongRef2.element) {
                            }
                        }
                        InquiryService inquiryService = pollingWorker.service;
                        String str4 = realDeviceIdProvider2.deviceId;
                        if (str4 == null) {
                            try {
                            } catch (IOException unused2) {
                                str = str2;
                                break;
                            }
                            str = str2;
                            str4 = ((SharedPreferences) realDeviceIdProvider2.prefs$delegate.getValue()).getString("DEVICE_ID", str3);
                        } else {
                            str = str2;
                        }
                        String str5 = pollingWorker.inquiryId;
                        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        createListBuilder.add("theme-variable-fonts");
                        InquirySessionConfig inquirySessionConfig = pollingWorker.inquirySessionConfig;
                        inquirySessionConfig.getClass();
                        if (inquirySessionConfig == InquirySessionConfig.Default) {
                            try {
                            } catch (IOException unused3) {
                                j2 = currentTimeMillis;
                                realDeviceIdProvider = realDeviceIdProvider2;
                                coroutineSingletons = coroutineSingletons3;
                                str2 = str;
                                coroutineSingletons3 = coroutineSingletons;
                                currentTimeMillis = j2;
                                realDeviceIdProvider2 = realDeviceIdProvider;
                                str3 = null;
                                if (System.currentTimeMillis() - currentTimeMillis < ref$LongRef2.element) {
                                }
                            }
                            createListBuilder.add("current-inquiry-session");
                        }
                        InquiryTheme inquiryTheme = (InquiryTheme) ((StateFlowImpl) inquiryThemeManager.themeFlow).getValue();
                        inquiryTheme.getClass();
                        if (inquiryTheme == InquiryTheme.Default) {
                            createListBuilder.add("inquiry-template-version");
                        }
                        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt__CollectionsJVMKt.build(createListBuilder), ",", null, null, 0, null, null, 62);
                        this.L$0 = flowCollector;
                        this.L$1 = ref$LongRef;
                        this.L$2 = ref$LongRef2;
                        this.I$0 = i;
                        this.J$0 = currentTimeMillis;
                        this.label = 2;
                        j2 = currentTimeMillis;
                        FlowCollector flowCollector4 = flowCollector;
                        str2 = str;
                        Ref$LongRef ref$LongRef7 = ref$LongRef;
                        obj2 = inquiryService.checkInquiry(str2, str4, str5, joinToString$default, this);
                        if (obj2 != coroutineSingletons3) {
                            j = j2;
                            ref$LongRef3 = ref$LongRef2;
                            ref$LongRef4 = ref$LongRef7;
                            flowCollector2 = flowCollector4;
                            try {
                            } catch (IOException unused4) {
                                realDeviceIdProvider = realDeviceIdProvider2;
                                coroutineSingletons = coroutineSingletons3;
                                FlowCollector flowCollector5 = flowCollector2;
                                ref$LongRef2 = ref$LongRef3;
                                flowCollector = flowCollector5;
                                ref$LongRef = ref$LongRef4;
                                j2 = j;
                                coroutineSingletons3 = coroutineSingletons;
                                currentTimeMillis = j2;
                                realDeviceIdProvider2 = realDeviceIdProvider;
                                str3 = null;
                                if (System.currentTimeMillis() - currentTimeMillis < ref$LongRef2.element) {
                                }
                            }
                            retrofit2.Response response2 = (retrofit2.Response) obj2;
                            response = response2.rawResponse;
                            if (response.isSuccessful) {
                                String str6 = response.headers.get("persona-device-id");
                                if (str6 != null) {
                                    realDeviceIdProvider2.setDeviceId(str6);
                                }
                                Object obj3 = response2.body;
                                if (obj3 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                    return null;
                                }
                                CheckInquiryResponse checkInquiryResponse = (CheckInquiryResponse) obj3;
                                String environment = checkInquiryResponse.getData().getAttributes().getEnvironment();
                                realDeviceIdProvider = realDeviceIdProvider2;
                                String lowerCase = "SANDBOX".toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                if (Intrinsics.areEqual(environment, lowerCase)) {
                                    pollingWorker.sandboxFlags.isSandboxModeEnabled = true;
                                }
                                List<Included> included = checkInquiryResponse.getIncluded();
                                if (included != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = included.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        Iterator it2 = it;
                                        if (next instanceof Included.Font) {
                                            arrayList2.add(next);
                                        }
                                        it = it2;
                                    }
                                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        Included.Font font = (Included.Font) it3.next();
                                        arrayList.add(new RemoteFont(font.getAttributes().getFontFamilyName(), font.getAttributes().getFontWeight(), font.getAttributes().getUrl()));
                                        it3 = it3;
                                        j = j;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                j3 = j;
                                RealFontDownloader realFontDownloader2 = (RealFontDownloader) pollingWorker.fontDownloader;
                                realFontDownloader2.getClass();
                                List list = arrayList;
                                if (arrayList == null) {
                                    list = EmptyList.INSTANCE;
                                }
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    RemoteFont remoteFont = (RemoteFont) it4.next();
                                    String str7 = remoteFont.fontFamilyName;
                                    String str8 = remoteFont.url;
                                    StyleElements.FontWeight fontWeight = remoteFont.fontWeight;
                                    if (str7 != null && str8 != null && fontWeight != null) {
                                        Iterator it5 = it4;
                                        Map map = realFontDownloader2.fontDownloaderMapping;
                                        Object obj4 = map.get(str7);
                                        if (obj4 == null) {
                                            realFontDownloader = realFontDownloader2;
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            map.put(str7, linkedHashMap);
                                            obj4 = linkedHashMap;
                                        } else {
                                            realFontDownloader = realFontDownloader2;
                                        }
                                        ((Map) obj4).put(fontWeight, str8);
                                        it4 = it5;
                                        realFontDownloader2 = realFontDownloader;
                                    }
                                }
                                List<Included> included2 = checkInquiryResponse.getIncluded();
                                if (included2 != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj5 : included2) {
                                        if (obj5 instanceof InquiryTemplateVersion) {
                                            arrayList3.add(obj5);
                                        }
                                    }
                                    InquiryTemplateVersion inquiryTemplateVersion = (InquiryTemplateVersion) CollectionsKt.firstOrNull((List) arrayList3);
                                    if (inquiryTemplateVersion != null && (attributes = inquiryTemplateVersion.getAttributes()) != null && (theme = attributes.getTheme()) != null) {
                                        InquiryTheme inquiryTheme2 = new InquiryTheme(Intrinsics.areEqual(theme.getIconStyle(), "none") ? InquiryTheme.IconStyle.None : InquiryTheme.IconStyle.Default);
                                        inquiryThemeManager.getClass();
                                        StateFlowImpl stateFlowImpl = (StateFlowImpl) inquiryThemeManager.themeFlow;
                                        stateFlowImpl.getClass();
                                        stateFlowImpl.updateState(null, inquiryTheme2);
                                    }
                                }
                                CheckInquiryResponse.WaitForTransitionConfig waitForTransitionConfig = checkInquiryResponse.getData().getAttributes().getWaitForTransitionConfig();
                                List<Included> included3 = checkInquiryResponse.getIncluded();
                                if (included3 != null) {
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj6 : included3) {
                                        if (obj6 instanceof InquirySessionData) {
                                            arrayList4.add(obj6);
                                        }
                                    }
                                    inquirySessionData = (InquirySessionData) CollectionsKt.firstOrNull((List) arrayList4);
                                } else {
                                    inquirySessionData = null;
                                }
                                if (inquirySessionData != null) {
                                    pollingWorker.inquiryApiHelper.updateClientStateWithSessionData$inquiry_internal_release(inquirySessionData);
                                    pollingWorker.inquirySessionConfig = InquiryApiHelperKt.toInquirySessionConfig(inquirySessionData.getAttributes());
                                }
                                int i3 = WhenMappings.$EnumSwitchMapping$0[waitForTransitionConfig.getPollingMode().ordinal()];
                                if (i3 != 1 && i3 != 2) {
                                    if (i3 != 3) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    PollingWorker.Response.Success success2 = new PollingWorker.Response.Success(ConversionsKt.toInquiryState(checkInquiryResponse, str2, pollingWorker.inquirySessionConfig));
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 4;
                                    break;
                                } else {
                                    Long intervalMs = waitForTransitionConfig.getIntervalMs();
                                    if (intervalMs != null) {
                                        ref$LongRef4.element = intervalMs.longValue();
                                    }
                                    Long maxAttempts = waitForTransitionConfig.getMaxAttempts();
                                    if (maxAttempts != null) {
                                        long longValue = maxAttempts.longValue();
                                        coroutineSingletons2 = coroutineSingletons3;
                                        ref$LongRef3.element = longValue * ref$LongRef4.element;
                                    } else {
                                        coroutineSingletons2 = coroutineSingletons3;
                                    }
                                    CheckInquiryResponse.PollingMode pollingMode3 = waitForTransitionConfig.getPollingMode();
                                    pollingMode3.getClass();
                                    int i4 = PollingModeKt$WhenMappings.$EnumSwitchMapping$0[pollingMode3.ordinal()];
                                    if (i4 == 1) {
                                        pollingMode = PollingMode.Blocking;
                                    } else if (i4 == 2) {
                                        pollingMode = PollingMode.Background;
                                    } else {
                                        if (i4 != 3) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        pollingMode = PollingMode.Blocking;
                                    }
                                    if (pollingMode2 != pollingMode) {
                                        PollingWorker.Response.Success success3 = new PollingWorker.Response.Success(ConversionsKt.toInquiryState(checkInquiryResponse, str2, pollingWorker.inquirySessionConfig).updateTransitionStatus(new TransitionStatus.CheckingForNextState(pollingMode, pollingWorker.canReuseWorkflow)));
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 3;
                                        if (flowCollector2.emit(success3, this) == coroutineSingletons2) {
                                            return coroutineSingletons2;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    i2 = i;
                                }
                            } else {
                                j3 = j;
                                realDeviceIdProvider = realDeviceIdProvider2;
                                coroutineSingletons2 = coroutineSingletons3;
                                InternalErrorInfo.NetworkErrorInfo errorInfo = NetworkUtilsKt.toErrorInfo(response2);
                                if (!errorInfo.isRecoverable()) {
                                    PollingWorker.Response.Error error = new PollingWorker.Response.Error(errorInfo);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 5;
                                    if (flowCollector2.emit(error, this) == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (i >= 2) {
                                    PollingWorker.Response.Error error2 = new PollingWorker.Response.Error(errorInfo);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                    if (flowCollector2.emit(error2, this) == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    return Unit.INSTANCE;
                                }
                                i2 = i + 1;
                                Okio.boxInt(i);
                            }
                            j4 = ref$LongRef4.element;
                            this.L$0 = flowCollector2;
                            this.L$1 = ref$LongRef4;
                            this.L$2 = ref$LongRef3;
                            this.I$0 = i2;
                            j5 = j3;
                            this.J$0 = j5;
                            this.label = 7;
                            if (JobKt.delay(j4, this) != coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            FlowCollector flowCollector6 = flowCollector2;
                            ref$LongRef2 = ref$LongRef3;
                            flowCollector = flowCollector6;
                            i = i2;
                            ref$LongRef = ref$LongRef4;
                            coroutineSingletons3 = coroutineSingletons2;
                            currentTimeMillis = j5;
                            realDeviceIdProvider2 = realDeviceIdProvider;
                            str3 = null;
                            if (System.currentTimeMillis() - currentTimeMillis < ref$LongRef2.element) {
                                FlowCollector flowCollector7 = flowCollector;
                                CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                                if (pollingMode2 == PollingMode.Blocking) {
                                    PollingWorker.Response.Error error3 = new PollingWorker.Response.Error(new InternalErrorInfo.NetworkErrorInfo(0, "Timeout error. Wait for transition exceeded 90000ms.", true, null, 8, null));
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 8;
                                    if (flowCollector7.emit(error3, this) == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutineSingletons3;
                    }
                }
                break;
            case 1:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 2:
                j = this.J$0;
                int i5 = this.I$0;
                ref$LongRef3 = this.L$2;
                Ref$LongRef ref$LongRef8 = this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                    ref$LongRef4 = ref$LongRef8;
                    i = i5;
                    obj2 = obj;
                } catch (IOException unused5) {
                    i = i5;
                    ref$LongRef = ref$LongRef8;
                    ref$LongRef2 = ref$LongRef3;
                    flowCollector = flowCollector2;
                    j2 = j;
                    realDeviceIdProvider = realDeviceIdProvider2;
                    coroutineSingletons = coroutineSingletons3;
                    coroutineSingletons3 = coroutineSingletons;
                    currentTimeMillis = j2;
                    realDeviceIdProvider2 = realDeviceIdProvider;
                    str3 = null;
                    if (System.currentTimeMillis() - currentTimeMillis < ref$LongRef2.element) {
                    }
                }
                retrofit2.Response response22 = (retrofit2.Response) obj2;
                response = response22.rawResponse;
                if (response.isSuccessful) {
                }
                j4 = ref$LongRef4.element;
                this.L$0 = flowCollector2;
                this.L$1 = ref$LongRef4;
                this.L$2 = ref$LongRef3;
                this.I$0 = i2;
                j5 = j3;
                this.J$0 = j5;
                this.label = 7;
                if (JobKt.delay(j4, this) != coroutineSingletons2) {
                }
                break;
            case 3:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 5:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 6:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 7:
                long j6 = this.J$0;
                int i6 = this.I$0;
                Ref$LongRef ref$LongRef9 = this.L$2;
                Ref$LongRef ref$LongRef10 = this.L$1;
                FlowCollector flowCollector8 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                i = i6;
                ref$LongRef = ref$LongRef10;
                ref$LongRef2 = ref$LongRef9;
                flowCollector = flowCollector8;
                realDeviceIdProvider = realDeviceIdProvider2;
                coroutineSingletons2 = coroutineSingletons3;
                j5 = j6;
                coroutineSingletons3 = coroutineSingletons2;
                currentTimeMillis = j5;
                realDeviceIdProvider2 = realDeviceIdProvider;
                str3 = null;
                if (System.currentTimeMillis() - currentTimeMillis < ref$LongRef2.element) {
                }
                break;
            case 8:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
