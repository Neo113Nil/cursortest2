package kotlin.reflect.jvm.internal.impl.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check;
import kotlin.reflect.jvm.internal.impl.util.Checks;

/* loaded from: classes9.dex */
public abstract class ReturnsCheck implements Check {
    public final String description;

    /* renamed from: type, reason: collision with root package name */
    public final Function1 f1539type;

    public static final class ReturnsBoolean extends ReturnsCheck {
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean("Boolean", Checks.AnonymousClass2.INSTANCE$6, null);
    }

    public static final class ReturnsInt extends ReturnsCheck {
        public static final ReturnsInt INSTANCE = new ReturnsInt("Int", Checks.AnonymousClass2.INSTANCE$7, null);
    }

    public static final class ReturnsUnit extends ReturnsCheck {
        public static final ReturnsUnit INSTANCE = new ReturnsUnit("Unit", Checks.AnonymousClass2.INSTANCE$8, null);
    }

    public ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this.f1539type = function1;
        this.description = Recorder$$ExternalSyntheticOutline2.m("must return ", str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        return Intrinsics.areEqual(functionDescriptor.getReturnType(), this.f1539type.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.description;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public /* bridge */ String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
