package com.unity3d.player;

import com.unity3d.player.a.AbstractC0019t;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.unity3d.player.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051n implements InvocationHandler {
    public final RunnableC0057q a;
    public final UnityPlayer b;
    public final long c;
    public final /* synthetic */ long d;

    public C0051n(long j, UnityPlayer unityPlayer) {
        long j2;
        this.d = j;
        j2 = ReflectionHelper.b;
        this.a = new RunnableC0057q(j2, j);
        this.b = unityPlayer;
        this.c = j2;
    }

    public static Object a(Object obj, Method method, Object[] objArr, C0055p c0055p) {
        try {
            if (objArr == null) {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    AbstractC0019t.Log(6, "Java interface default methods are only supported since Android Oreo");
                    ReflectionHelper.nativeProxyLogJNIInvokeException(c0055p.a);
                    c0055p.a = 0L;
                    return null;
                }
            }
            Class<?> declaringClass = method.getDeclaringClass();
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        } finally {
            long j = c0055p.a;
            if (j != 0) {
                ReflectionHelper.nativeProxyJNIFreeGCHandle(j);
            }
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object nativeProxyInvoke;
        if (!ReflectionHelper.beginProxyCall(this.c)) {
            AbstractC0019t.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            nativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.d, method.getName(), objArr);
            if (!(nativeProxyInvoke instanceof C0055p)) {
                return nativeProxyInvoke;
            }
            C0055p c0055p = (C0055p) nativeProxyInvoke;
            if (c0055p.b && (method.getModifiers() & 1024) == 0) {
                return a(obj, method, objArr, c0055p);
            }
            ReflectionHelper.nativeProxyLogJNIInvokeException(c0055p.a);
            return null;
        } finally {
            ReflectionHelper.endProxyCall();
        }
    }

    public void finalize() {
        this.b.invokeOnMainThread(this.a);
        super.finalize();
    }
}
