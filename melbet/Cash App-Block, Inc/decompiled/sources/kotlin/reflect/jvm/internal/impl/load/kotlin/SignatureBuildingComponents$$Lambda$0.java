package kotlin.reflect.jvm.internal.impl.load.kotlin;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class SignatureBuildingComponents$$Lambda$0 implements Function1 {
    public static final SignatureBuildingComponents$$Lambda$0 INSTANCE = new SignatureBuildingComponents$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        SignatureBuildingComponents.INSTANCE.getClass();
        return str.length() > 1 ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(';', "L", str) : str;
    }
}
