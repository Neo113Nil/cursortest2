package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface c extends b {
    Object call(Object... objArr);

    Object callBy(Map<Object, ? extends Object> map);

    @Override // kotlin.reflect.b
    /* synthetic */ List getAnnotations();

    String getName();

    List<Object> getParameters();

    q getReturnType();

    List<r> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
