package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface m extends c {

    public interface a extends h {
    }

    @Override // kotlin.reflect.c
    /* synthetic */ Object call(Object... objArr);

    @Override // kotlin.reflect.c
    /* synthetic */ Object callBy(Map map);

    @Override // kotlin.reflect.c, kotlin.reflect.b
    /* synthetic */ List getAnnotations();

    a getGetter();

    @Override // kotlin.reflect.c
    /* synthetic */ String getName();

    @Override // kotlin.reflect.c
    /* synthetic */ List getParameters();

    @Override // kotlin.reflect.c
    /* synthetic */ q getReturnType();

    @Override // kotlin.reflect.c
    /* synthetic */ List getTypeParameters();

    @Override // kotlin.reflect.c
    /* synthetic */ KVisibility getVisibility();

    @Override // kotlin.reflect.c
    /* synthetic */ boolean isAbstract();

    boolean isConst();

    @Override // kotlin.reflect.c
    /* synthetic */ boolean isFinal();

    boolean isLateinit();

    @Override // kotlin.reflect.c
    /* synthetic */ boolean isOpen();

    @Override // kotlin.reflect.c
    /* synthetic */ boolean isSuspend();
}
