package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcelable;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.AutoCaptureRuleSet;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$1;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes9.dex */
public abstract class ConversionsKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CapturePageConfig.RuleType.values().length];
            try {
                iArr[CapturePageConfig.RuleType.ID_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CapturePageConfig.RuleType.ID_FRONT_OR_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CapturePageConfig.RuleType.BARCODE_PDF417.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CapturePageConfig.RuleType.PASSPORT_MRZ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CapturePageConfig.RuleType.TEXT_EXTRACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CapturePageConfig.OverlayLocalIcon.values().length];
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.BARCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.ID_FRONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.ID_BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.CORNERS_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.EMPTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Id.IdLocalIcon.values().length];
            try {
                iArr3[Id.IdLocalIcon.WORLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Id.IdLocalIcon.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Id.IdLocalIcon.FLAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Id.IdLocalIcon.HOUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[IdConfig.Side.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                y0 y0Var = IdConfig.Side.Companion;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                y0 y0Var2 = IdConfig.Side.Companion;
                iArr4[3] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                y0 y0Var3 = IdConfig.Side.Companion;
                iArr4[2] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                y0 y0Var4 = IdConfig.Side.Companion;
                iArr4[4] = 5;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0258, code lost:
    
        if (r19 == com.withpersona.sdk2.inquiry.governmentid.network.IdClass.ResidencyPermit) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0134, code lost:
    
        if (r9 != null) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final IdConfig.IdSideConfig to(CapturePageConfig capturePageConfig, IdConfig.Side side, IdClass idClass, String str, long j) {
        IdConfig.IdSideConfig idSideConfig;
        IdConfig.AutoCaptureConfig autoCaptureConfig;
        IdConfig.AutoCaptureConfig autoCaptureConfig2;
        IdConfig.ManualCaptureConfig manualCaptureConfig;
        CapturePageConfig.OverlayConfig overlay;
        CapturePageConfig.ManualCaptureConfig manualCaptureConfig2;
        CapturePageConfig.AutoCaptureConfig autoCaptureConfig3;
        Object obj;
        ?? r10;
        Parcelable parcelable;
        boolean z;
        boolean z2;
        str.getClass();
        if (capturePageConfig == null || (autoCaptureConfig3 = capturePageConfig.getAutoCaptureConfig()) == null) {
            idSideConfig = null;
        } else {
            List<CapturePageConfig.RuleSet> ruleSets = autoCaptureConfig3.getRuleSets();
            if (ruleSets == null) {
                autoCaptureConfig2 = null;
            } else if (ruleSets.isEmpty()) {
                autoCaptureConfig2 = new IdConfig.AutoCaptureConfig();
            } else {
                Iterator it = ruleSets.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        idSideConfig = null;
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    List<CapturePageConfig.Rule> rules = ((CapturePageConfig.RuleSet) obj).getRules();
                    if (rules != null) {
                        z = false;
                        z2 = true;
                        for (CapturePageConfig.Rule rule : rules) {
                            if (Intrinsics.areEqual(rule.isRequired(), Boolean.TRUE) && rule.getType() == null) {
                                z2 = false;
                            } else if (rule.getType() != null) {
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                        z2 = true;
                    }
                    idSideConfig = null;
                    if (z2 && z) {
                        break;
                    }
                }
                CapturePageConfig.RuleSet ruleSet = (CapturePageConfig.RuleSet) obj;
                if (ruleSet == null) {
                    autoCaptureConfig2 = new IdConfig.AutoCaptureConfig();
                } else {
                    List<CapturePageConfig.Rule> rules2 = ruleSet.getRules();
                    if (rules2 != null) {
                        r10 = new ArrayList();
                        for (CapturePageConfig.Rule rule2 : rules2) {
                            CapturePageConfig.RuleType type2 = rule2.getType();
                            int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                            if (i == -1) {
                                parcelable = idSideConfig;
                            } else if (i == 1) {
                                parcelable = new AutoCaptureRule.FrontRule(Intrinsics.areEqual(rule2.isRequired(), Boolean.TRUE));
                            } else if (i == 2) {
                                parcelable = new AutoCaptureRule.FrontOrBackRule(Intrinsics.areEqual(rule2.isRequired(), Boolean.TRUE));
                            } else if (i == 3) {
                                parcelable = new AutoCaptureRule.BarcodePdf417Rule(Intrinsics.areEqual(rule2.isRequired(), Boolean.TRUE));
                            } else if (i == 4) {
                                parcelable = new AutoCaptureRule.MrzRule(Intrinsics.areEqual(rule2.isRequired(), Boolean.TRUE));
                            } else {
                                if (i != 5) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return idSideConfig;
                                }
                                parcelable = new AutoCaptureRule.TextExtractionRule(Intrinsics.areEqual(rule2.isRequired(), Boolean.TRUE));
                            }
                            if (parcelable != null) {
                                r10.add(parcelable);
                            }
                        }
                    } else {
                        r10 = EmptyList.INSTANCE;
                    }
                    autoCaptureConfig2 = new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(r10));
                }
            }
            idSideConfig = null;
        }
        int ordinal = side.ordinal();
        if (ordinal == 0) {
            autoCaptureConfig = new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt__CollectionsJVMKt.listOf(new AutoCaptureRule.FrontRule(false))));
        } else if (ordinal == 1) {
            autoCaptureConfig = new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt__CollectionsJVMKt.listOf(new AutoCaptureRule.BarcodePdf417Rule(false))));
        } else if (ordinal == 2) {
            autoCaptureConfig = new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt__CollectionsJVMKt.listOf(new AutoCaptureRule.FrontOrBackRule(false))));
        } else if (ordinal == 3) {
            autoCaptureConfig = new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt__CollectionsJVMKt.listOf(new AutoCaptureRule.BarcodePdf417Rule(false))));
        } else {
            if (ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return idSideConfig;
            }
            autoCaptureConfig = new IdConfig.AutoCaptureConfig();
        }
        autoCaptureConfig2 = autoCaptureConfig;
        IdConfig.AutoCaptureConfig autoCaptureConfig4 = autoCaptureConfig2;
        if (capturePageConfig == null || (manualCaptureConfig2 = capturePageConfig.getManualCaptureConfig()) == null) {
            manualCaptureConfig = new IdConfig.ManualCaptureConfig(true, j);
        } else {
            Boolean isEnabled = manualCaptureConfig2.isEnabled();
            boolean booleanValue = isEnabled != null ? isEnabled.booleanValue() : true;
            Long delayMs = manualCaptureConfig2.getDelayMs();
            manualCaptureConfig = new IdConfig.ManualCaptureConfig(booleanValue, delayMs != null ? delayMs.longValue() : j);
        }
        if (autoCaptureConfig4.ruleSet.rules.isEmpty() && !manualCaptureConfig.isEnabled) {
            return idSideConfig;
        }
        String str2 = side.key;
        Screen.Overlay overlay2 = Screen.Overlay.Passport.INSTANCE;
        Screen.Overlay.GenericFront genericFront = Screen.Overlay.GenericFront.INSTANCE;
        Screen.Overlay.Rectangle rectangle = Screen.Overlay.Rectangle.INSTANCE;
        Screen.Overlay.Barcode barcode = Screen.Overlay.Barcode.INSTANCE;
        if (capturePageConfig == null || (overlay = capturePageConfig.getOverlay()) == null) {
            if (side != IdConfig.Side.BarcodePdf417) {
                if (side != IdConfig.Side.PassportSignature) {
                    IdClass idClass2 = IdClass.DriverLicense;
                    if (idClass != idClass2 || side != IdConfig.Side.Back || !str.equals("US")) {
                        if (idClass != IdClass.Passport && idClass != IdClass.Visa) {
                            if (idClass != idClass2) {
                                if (idClass != IdClass.StateID) {
                                }
                            }
                            overlay2 = genericFront;
                        }
                    }
                }
                overlay2 = rectangle;
            }
            overlay2 = barcode;
        } else {
            RemoteImage overlay3 = overlay.getOverlay();
            if (overlay3 == null) {
                CapturePageConfig.OverlayLocalIcon overlayFallback = overlay.getOverlayFallback();
                switch (overlayFallback != null ? WhenMappings.$EnumSwitchMapping$1[overlayFallback.ordinal()] : -1) {
                    case -1:
                    case 6:
                        overlay2 = rectangle;
                        break;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return idSideConfig;
                    case 1:
                    case 4:
                        overlay2 = barcode;
                        break;
                    case 2:
                        break;
                    case 3:
                        overlay2 = genericFront;
                        break;
                    case 5:
                        overlay2 = Screen.Overlay.CornersOnly.INSTANCE;
                        break;
                }
            } else {
                overlay2 = new Screen.Overlay.Custom(new RemoteImageComponent(overlay3), overlay3);
            }
        }
        return new IdConfig.IdSideConfig(str2, side, overlay2, autoCaptureConfig4, manualCaptureConfig);
    }

    public static final IdConfig toIdConfig(Id id, String str, long j) {
        IdIcon idIcon;
        String str2;
        long j2;
        IdConfig.IdSideConfig idSideConfig;
        id.getClass();
        str.getClass();
        KClasses$$Lambda$1 kClasses$$Lambda$1 = IdClass.Companion;
        String str3 = id.getClass();
        kClasses$$Lambda$1.getClass();
        str3.getClass();
        IdClass idClass = (IdClass) IdClass.codes.get(str3);
        if (idClass == null) {
            idClass = IdClass.Unknown;
        }
        IdClass idClass2 = idClass;
        if (idClass2 != IdClass.Unknown || id.isDynamicGovId()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<CapturePageConfig> capturePageConfigs = id.getCapturePageConfigs();
            if (capturePageConfigs != null) {
                for (CapturePageConfig capturePageConfig : capturePageConfigs) {
                    String side = capturePageConfig.getSide();
                    if (side != null) {
                        linkedHashMap.put(side, capturePageConfig);
                    }
                }
            }
            List<String> requiresSides = id.getRequiresSides();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(requiresSides, 10));
            for (String str4 : requiresSides) {
                IdConfig.Side.Companion.getClass();
                str4.getClass();
                IdConfig.Side side2 = (IdConfig.Side) ((Map) IdConfig.Side.sideKeyToSide$delegate.getValue()).get(str4);
                if (side2 != null && (idSideConfig = to((CapturePageConfig) linkedHashMap.get(str4), side2, idClass2, (str2 = str), (j2 = j))) != null) {
                    arrayList.add(idSideConfig);
                    str = str2;
                    j = j2;
                }
            }
            String str5 = id.getClass();
            if (id.isDynamicGovId()) {
                Id.IdIcon icon = id.getIcon();
                Id.IdLocalIcon iconFallback = icon != null ? icon.getIconFallback() : null;
                int i = iconFallback == null ? -1 : WhenMappings.$EnumSwitchMapping$2[iconFallback.ordinal()];
                if (i == -1) {
                    idIcon = IdIcon.Card;
                } else if (i == 1) {
                    idIcon = IdIcon.World;
                } else if (i == 2) {
                    idIcon = IdIcon.Card;
                } else if (i == 3) {
                    idIcon = IdIcon.Flag;
                } else {
                    if (i != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    idIcon = IdIcon.House;
                }
            } else {
                switch (idClass2.ordinal()) {
                    case 0:
                        idIcon = IdIcon.Card;
                        break;
                    case 1:
                        idIcon = IdIcon.Flag;
                        break;
                    case 2:
                        idIcon = IdIcon.Card;
                        break;
                    case 3:
                        idIcon = IdIcon.Card;
                        break;
                    case 4:
                        idIcon = IdIcon.Card;
                        break;
                    case 5:
                        idIcon = IdIcon.Card;
                        break;
                    case 6:
                        idIcon = IdIcon.Card;
                        break;
                    case 7:
                        idIcon = IdIcon.World;
                        break;
                    case 8:
                        idIcon = IdIcon.House;
                        break;
                    case 9:
                        idIcon = IdIcon.House;
                        break;
                    case 10:
                        idIcon = IdIcon.Card;
                        break;
                    case 11:
                        idIcon = IdIcon.Card;
                        break;
                    case 12:
                        idIcon = IdIcon.Card;
                        break;
                    case 13:
                        idIcon = IdIcon.Card;
                        break;
                    case 14:
                        idIcon = IdIcon.World;
                        break;
                    case 15:
                        idIcon = IdIcon.Card;
                        break;
                    case 16:
                        idIcon = IdIcon.World;
                        break;
                    case 17:
                        idIcon = IdIcon.Card;
                        break;
                    case 18:
                        idIcon = IdIcon.Card;
                        break;
                    case 19:
                        idIcon = IdIcon.Card;
                        break;
                    case 20:
                        idIcon = IdIcon.Card;
                        break;
                    case 21:
                        idIcon = IdIcon.Card;
                        break;
                    case 22:
                        idIcon = IdIcon.Card;
                        break;
                    case 23:
                        idIcon = IdIcon.Card;
                        break;
                    case 24:
                        idIcon = IdIcon.Card;
                        break;
                    case 25:
                        OptionalProvider$$ExternalSyntheticLambda0.m$1("IdClass is 'UNKNOWN'.");
                        return null;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new IdPart$SideIdPart(((IdConfig.IdSideConfig) it.next()).side));
            }
            return new IdConfig(str5, idIcon, arrayList, arrayList2, idClass2);
        }
        return null;
    }
}
