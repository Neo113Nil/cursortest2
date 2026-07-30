package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.reflect.m;

/* loaded from: classes4.dex */
public interface p extends m, f6.p {

    public interface a extends m.a, f6.p {
    }

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ Object call(Object... objArr);

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ Object callBy(Map map);

    Object get(Object obj, Object obj2);

    @Override // kotlin.reflect.m, kotlin.reflect.c, kotlin.reflect.b
    /* synthetic */ List getAnnotations();

    Object getDelegate(Object obj, Object obj2);

    @Override // kotlin.reflect.m, kotlin.reflect.i
    /* synthetic */ m.a getGetter();

    @Override // kotlin.reflect.m, kotlin.reflect.i
    a getGetter();

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ String getName();

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ List getParameters();

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ q getReturnType();

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ List getTypeParameters();

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ KVisibility getVisibility();

    @Override // f6.p
    /* synthetic */ Object invoke(Object obj, Object obj2);

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isAbstract();

    @Override // kotlin.reflect.m
    /* synthetic */ boolean isConst();

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isFinal();

    @Override // kotlin.reflect.m
    /* synthetic */ boolean isLateinit();

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isOpen();

    @Override // kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isSuspend();
}
