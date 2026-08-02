package kotlin.jvm.internal;

import com.squareup.cash.growtools.presenters.manager.activity.GrowToolsProductClassifierUtilsKt$WhenMappings;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Method;
import java.util.concurrent.Future;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;

/* loaded from: classes4.dex */
public abstract class KotlinGenericDeclarationKt {
    public static final void appendClass(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append(GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY);
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
        } else {
            if (cls.equals(Double.TYPE)) {
                sb.append("D");
                return;
            }
            sb.append("L");
            sb.append((CharSequence) StringsKt__StringsJVMKt.replace(cls.getName(), '.', '/', false));
            sb.append(";");
        }
    }

    public static final Method findMethodBySignature(KDeclarationContainer kDeclarationContainer, String str) {
        str.getClass();
        if (!(kDeclarationContainer instanceof ClassBasedDeclarationContainer)) {
            return null;
        }
        String substringBefore$default = StringsKt.substringBefore$default(str, '(');
        if (substringBefore$default.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + kDeclarationContainer + '/' + str);
        }
        Method[] declaredMethods = ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (Intrinsics.areEqual(method.getName(), substringBefore$default)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    appendClass(sb, cls);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                appendClass(sb, returnType);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    public static final ListBuilder getActivityClassifiers(GrowToolsManagerScreen growToolsManagerScreen) {
        growToolsManagerScreen.getClass();
        if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageAutoInvestScreen) {
            GrowToolsManagerScreen.Origin origin = ((GrowToolsManagerScreen.ManageAutoInvestScreen) growToolsManagerScreen).origin;
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            createListBuilder.add(ActivityProductClassifier.APC_RECURRING);
            if (GrowToolsProductClassifierUtilsKt$WhenMappings.$EnumSwitchMapping$0[origin.ordinal()] == 1) {
                createListBuilder.add(ActivityProductClassifier.APC_BTC);
            }
            return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        }
        if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageDirectDepositScreen) {
            GrowToolsManagerScreen.Origin origin2 = ((GrowToolsManagerScreen.ManageDirectDepositScreen) growToolsManagerScreen).origin;
            ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
            createListBuilder2.add(ActivityProductClassifier.APC_PAYCHECK_DISTRIBUTION);
            if (GrowToolsProductClassifierUtilsKt$WhenMappings.$EnumSwitchMapping$0[origin2.ordinal()] == 1) {
                createListBuilder2.add(ActivityProductClassifier.APC_BTC);
            }
            return CollectionsKt__CollectionsJVMKt.build(createListBuilder2);
        }
        if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageRoundUpsScreen) {
            GrowToolsManagerScreen.Origin origin3 = ((GrowToolsManagerScreen.ManageRoundUpsScreen) growToolsManagerScreen).origin;
            ListBuilder createListBuilder3 = CollectionsKt__CollectionsJVMKt.createListBuilder();
            createListBuilder3.add(ActivityProductClassifier.APC_ROUND_UP);
            if (GrowToolsProductClassifierUtilsKt$WhenMappings.$EnumSwitchMapping$0[origin3.ordinal()] == 1) {
                createListBuilder3.add(ActivityProductClassifier.APC_BTC);
            }
            return CollectionsKt__CollectionsJVMKt.build(createListBuilder3);
        }
        if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen) {
            ListBuilder createListBuilder4 = CollectionsKt__CollectionsJVMKt.createListBuilder();
            createListBuilder4.add(ActivityProductClassifier.APC_P2P_RECEIVE_AS_BITCOIN);
            return CollectionsKt__CollectionsJVMKt.build(createListBuilder4);
        }
        if (!(growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        ListBuilder createListBuilder5 = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder5.add(ActivityProductClassifier.APC_BTC_AUTO_WITHDRAWAL);
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder5);
    }

    public static Object getUninterruptibly(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
