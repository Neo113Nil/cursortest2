package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.reflect.i;
import kotlin.reflect.m;
import kotlin.reflect.o;

/* loaded from: classes4.dex */
public interface k extends o, i {

    public interface a extends i.a, f6.p {
    }

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ Object call(Object... objArr);

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ Object callBy(Map map);

    @Override // kotlin.reflect.o
    /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c, kotlin.reflect.b
    /* synthetic */ List getAnnotations();

    @Override // kotlin.reflect.o
    /* synthetic */ Object getDelegate(Object obj);

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.i
    /* synthetic */ m.a getGetter();

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.i
    /* synthetic */ o.a getGetter();

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ String getName();

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ List getParameters();

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ q getReturnType();

    @Override // kotlin.reflect.i
    /* synthetic */ i.a getSetter();

    @Override // kotlin.reflect.i
    a getSetter();

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ List getTypeParameters();

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ KVisibility getVisibility();

    @Override // kotlin.reflect.o, f6.l
    /* synthetic */ Object invoke(Object obj);

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isAbstract();

    @Override // kotlin.reflect.o, kotlin.reflect.m
    /* synthetic */ boolean isConst();

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isFinal();

    @Override // kotlin.reflect.o, kotlin.reflect.m
    /* synthetic */ boolean isLateinit();

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isOpen();

    @Override // kotlin.reflect.o, kotlin.reflect.m, kotlin.reflect.c
    /* synthetic */ boolean isSuspend();

    void set(Object obj, Object obj2);
}
