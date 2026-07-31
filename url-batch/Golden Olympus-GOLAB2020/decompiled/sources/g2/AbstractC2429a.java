package g2;

import kotlin.jvm.internal.H;
import kotlin.jvm.internal.InterfaceC3242h;
import kotlin.jvm.internal.Intrinsics;
import m2.c;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2429a {
    public static final Class a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Class a4 = ((InterfaceC3242h) cVar).a();
        Intrinsics.checkNotNull(a4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a4;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class b(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Class a4 = ((InterfaceC3242h) cVar).a();
        if (!a4.isPrimitive()) {
            Intrinsics.checkNotNull(a4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return a4;
        }
        String name = a4.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    a4 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    a4 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    a4 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    a4 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    a4 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    a4 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    a4 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    a4 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    a4 = Short.class;
                    break;
                }
                break;
        }
        Intrinsics.checkNotNull(a4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return a4;
    }

    public static final c c(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return H.b(cls);
    }
}
