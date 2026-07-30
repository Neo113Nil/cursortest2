package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.reflect.i;
import kotlin.reflect.m;
import kotlin.reflect.n;

/* loaded from: classes4.dex */
public interface j extends n, i {

    public interface a extends i.a, f6.l {
    }

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ Object call(Object... objArr);

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ Object callBy(Map map);

    @Override // kotlin.reflect.n
    /* synthetic */ Object get();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c, kotlin.reflect.b
    /* synthetic */ List getAnnotations();

    @Override // kotlin.reflect.n
    /* synthetic */ Object getDelegate();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.i
    /* synthetic */ m.a getGetter();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.i
    /* synthetic */ n.a getGetter();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ String getName();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ List getParameters();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ q getReturnType();

    @Override // kotlin.reflect.i
    /* synthetic */ i.a getSetter();

    @Override // kotlin.reflect.i
    a getSetter();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ List getTypeParameters();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ KVisibility getVisibility();

    @Override // kotlin.reflect.n, f6.a
    /* synthetic */ Object invoke();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isAbstract();

    @Override // kotlin.reflect.n, kotlin.reflect.m
    /* synthetic */ boolean isConst();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isFinal();

    @Override // kotlin.reflect.n, kotlin.reflect.m
    /* synthetic */ boolean isLateinit();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isOpen();

    @Override // kotlin.reflect.n, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isSuspend();

    void set(Object obj);
}
