package com.unity3d.player;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.unity3d.player.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1772r implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC1778u f22237a;

    /* renamed from: b, reason: collision with root package name */
    public final UnityPlayer f22238b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22239c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22240d;

    public C1772r(long j4, UnityPlayer unityPlayer) {
        long j5;
        this.f22240d = j4;
        j5 = ReflectionHelper.f22073b;
        this.f22237a = new RunnableC1778u(j5, j4);
        this.f22238b = unityPlayer;
        this.f22239c = j5;
    }

    public static Object a(Object obj, Method method, Object[] objArr, C1776t c1776t) {
        MethodHandles.Lookup in;
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        if (objArr == null) {
            try {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    h1.T.a(6, "Java interface default methods are only supported since Android Oreo");
                    ReflectionHelper.nativeProxyLogJNIInvokeException(c1776t.f22252a);
                    c1776t.f22252a = 0L;
                    return null;
                }
            } catch (Throwable th) {
                long j4 = c1776t.f22252a;
                if (j4 != 0) {
                    ReflectionHelper.nativeProxyJNIFreeGCHandle(j4);
                }
                throw th;
            }
        }
        Class<?> declaringClass = method.getDeclaringClass();
        Constructor declaredConstructor = J1.a().getDeclaredConstructor(Class.class, Integer.TYPE);
        declaredConstructor.setAccessible(true);
        in = K1.a(declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass);
        unreflectSpecial = in.unreflectSpecial(method, declaringClass);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        long j5 = c1776t.f22252a;
        if (j5 != 0) {
            ReflectionHelper.nativeProxyJNIFreeGCHandle(j5);
        }
        return invokeWithArguments;
    }

    public void finalize() {
        this.f22238b.invokeOnMainThread(this.f22237a);
        super.finalize();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object nativeProxyInvoke;
        if (!ReflectionHelper.beginProxyCall(this.f22239c)) {
            h1.T.a(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            nativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.f22240d, method.getName(), objArr);
            if (!(nativeProxyInvoke instanceof C1776t)) {
                return nativeProxyInvoke;
            }
            C1776t c1776t = (C1776t) nativeProxyInvoke;
            if (c1776t.f22253b && (method.getModifiers() & 1024) == 0) {
                return a(obj, method, objArr, c1776t);
            }
            ReflectionHelper.nativeProxyLogJNIInvokeException(c1776t.f22252a);
            return null;
        } finally {
            ReflectionHelper.endProxyCall();
        }
    }
}
