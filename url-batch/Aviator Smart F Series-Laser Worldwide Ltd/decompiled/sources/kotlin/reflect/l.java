package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.reflect.i;
import kotlin.reflect.m;
import kotlin.reflect.p;

/* loaded from: classes4.dex */
public interface l extends p, i {

    public interface a extends i.a, f6.q {
    }

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ Object call(Object... objArr);

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ Object callBy(Map map);

    @Override // kotlin.reflect.p
    /* synthetic */ Object get(Object obj, Object obj2);

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c, kotlin.reflect.b
    /* synthetic */ List getAnnotations();

    @Override // kotlin.reflect.p
    /* synthetic */ Object getDelegate(Object obj, Object obj2);

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.i
    /* synthetic */ m.a getGetter();

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.i
    /* synthetic */ p.a getGetter();

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ String getName();

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ List getParameters();

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ q getReturnType();

    @Override // kotlin.reflect.i
    /* synthetic */ i.a getSetter();

    @Override // kotlin.reflect.i
    a getSetter();

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ List getTypeParameters();

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ KVisibility getVisibility();

    @Override // kotlin.reflect.p, f6.p
    /* synthetic */ Object invoke(Object obj, Object obj2);

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isAbstract();

    @Override // kotlin.reflect.p, kotlin.reflect.m
    /* synthetic */ boolean isConst();

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isFinal();

    @Override // kotlin.reflect.p, kotlin.reflect.m
    /* synthetic */ boolean isLateinit();

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isOpen();

    @Override // kotlin.reflect.p, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isSuspend();

    void set(Object obj, Object obj2, Object obj3);
}
