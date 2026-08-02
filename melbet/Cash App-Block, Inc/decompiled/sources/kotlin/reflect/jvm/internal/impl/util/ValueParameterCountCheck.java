package kotlin.reflect.jvm.internal.impl.util;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes9.dex */
public abstract class ValueParameterCountCheck implements Check {
    public final String description;

    public static final class AtLeast extends ValueParameterCountCheck {
        public final int n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AtLeast(int i) {
            super(r0.toString(), null);
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "must have at least ", " value parameter");
            m2m.append(i > 1 ? "s" : "");
            this.n = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.getValueParameters().size() >= this.n;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {
        public final int n;

        public Equals(int i) {
            super(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "must have exactly ", " value parameters"), null);
            this.n = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.getValueParameters().size() == this.n;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {
        public static final NoValueParameters INSTANCE = new NoValueParameters("must have no value parameters", null);

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {
        public static final SingleValueParameter INSTANCE = new SingleValueParameter("must have a single value parameter", null);

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    public ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.description = str;
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
