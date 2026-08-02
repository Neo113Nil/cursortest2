package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.reflect.KCallable;
import kotlin.reflect.jvm.internal.calls.Caller;

/* loaded from: classes3.dex */
public interface ReflectKCallable extends KCallable, KTypeParameterOwnerImpl {
    List getAllParameters();

    Caller getCaller();

    KDeclarationContainerImpl getContainer();

    Caller getDefaultCaller();

    Object getRawBoundReceiver();
}
