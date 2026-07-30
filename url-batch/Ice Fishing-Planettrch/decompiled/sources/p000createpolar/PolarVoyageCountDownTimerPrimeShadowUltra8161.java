package p000createpolar;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageCountDownTimerPrimeShadowUltra8161 {
    public static final char[] PolarVoyageZipVortexCelestial6185;

    static {
        char[] cArr = new char[80];
        PolarVoyageZipVortexCelestial6185 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0192, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0194, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a7, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bd, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageDrawableCompatOlympianPrime6391 polarVoyageDrawableCompatOlympianPrime6391, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = polarVoyageDrawableCompatOlympianPrime6391.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    PolarVoyageMotionLayoutTransitionHeroVision4068(sb, i, substring.substring(0, substring.length() - 4), PolarVoyageDrawableCompatOlympianPrime6391.PolarVoyageBitmapVisionAuroraPixel4705(method2, polarVoyageDrawableCompatOlympianPrime6391, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                PolarVoyageMotionLayoutTransitionHeroVision4068(sb, i, substring.substring(0, substring.length() - 3), PolarVoyageDrawableCompatOlympianPrime6391.PolarVoyageBitmapVisionAuroraPixel4705(method, polarVoyageDrawableCompatOlympianPrime6391, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageDrawableCompatOlympianPrime6391.PolarVoyageBitmapVisionAuroraPixel4705(method4, polarVoyageDrawableCompatOlympianPrime6391, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (PolarVoyageBitmapVisionAuroraPixel4705 instanceof Boolean) {
                            equals = !((Boolean) PolarVoyageBitmapVisionAuroraPixel4705).booleanValue();
                        } else if (!(PolarVoyageBitmapVisionAuroraPixel4705 instanceof Integer)) {
                            if (!(PolarVoyageBitmapVisionAuroraPixel4705 instanceof Float)) {
                                if (!(PolarVoyageBitmapVisionAuroraPixel4705 instanceof Double)) {
                                    equals = PolarVoyageBitmapVisionAuroraPixel4705 instanceof String ? PolarVoyageBitmapVisionAuroraPixel4705.equals("") : PolarVoyageBitmapVisionAuroraPixel4705 instanceof PolarVoyageDataBindingInfernoInfernoPixel1843 ? PolarVoyageBitmapVisionAuroraPixel4705.equals(PolarVoyageDataBindingInfernoInfernoPixel1843.PolarVoyageRotateAnimationCyberCelestialDelta4768) : !(PolarVoyageBitmapVisionAuroraPixel4705 instanceof PolarVoyageFlowCollectorPixelTurbo5520) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) PolarVoyageDrawableCompatOlympianPrime6391.PolarVoyageBitmapVisionAuroraPixel4705(method5, polarVoyageDrawableCompatOlympianPrime6391, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        PolarVoyageMotionLayoutTransitionHeroVision4068(sb, i, substring, PolarVoyageBitmapVisionAuroraPixel4705);
                    }
                }
            }
            i2 = i3;
        }
        PolarVoyageColorDrawableInfernoFusionShadow5897 polarVoyageColorDrawableInfernoFusionShadow5897 = polarVoyageDrawableCompatOlympianPrime6391.unknownFields;
        if (polarVoyageColorDrawableInfernoFusionShadow5897 != null) {
            for (int i5 = 0; i5 < polarVoyageColorDrawableInfernoFusionShadow5897.PolarVoyageZipVortexCelestial6185; i5++) {
                PolarVoyageMotionLayoutTransitionHeroVision4068(sb, i, String.valueOf(polarVoyageColorDrawableInfernoFusionShadow5897.PolarVoyageMotionLayoutTransitionHeroVision4068[i5] >>> 3), polarVoyageColorDrawableInfernoFusionShadow5897.PolarVoyageKotlinBetaPulseBeta3653[i5]);
            }
        }
    }

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                PolarVoyageMotionLayoutTransitionHeroVision4068(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                PolarVoyageMotionLayoutTransitionHeroVision4068(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        PolarVoyageZipVortexCelestial6185(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            PolarVoyageDataBindingInfernoInfernoPixel1843 polarVoyageDataBindingInfernoInfernoPixel1843 = PolarVoyageDataBindingInfernoInfernoPixel1843.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            sb.append(PolarVoyageFragmentManagerEpicMax6434.PolarVoyageTextInputEditTextNebulaHero6651(new PolarVoyageDataBindingInfernoInfernoPixel1843(((String) obj).getBytes(PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185))));
            sb.append('\"');
            return;
        }
        if (obj instanceof PolarVoyageDataBindingInfernoInfernoPixel1843) {
            sb.append(": \"");
            sb.append(PolarVoyageFragmentManagerEpicMax6434.PolarVoyageTextInputEditTextNebulaHero6651((PolarVoyageDataBindingInfernoInfernoPixel1843) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof PolarVoyageDrawableCompatOlympianPrime6391) {
            sb.append(" {");
            PolarVoyageKotlinBetaPulseBeta3653((PolarVoyageDrawableCompatOlympianPrime6391) obj, sb, i + 2);
            sb.append("\n");
            PolarVoyageZipVortexCelestial6185(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        PolarVoyageMotionLayoutTransitionHeroVision4068(sb, i3, "key", entry.getKey());
        PolarVoyageMotionLayoutTransitionHeroVision4068(sb, i3, "value", entry.getValue());
        sb.append("\n");
        PolarVoyageZipVortexCelestial6185(i, sb);
        sb.append("}");
    }

    public static void PolarVoyageZipVortexCelestial6185(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(PolarVoyageZipVortexCelestial6185, 0, i2);
            i -= i2;
        }
    }
}
