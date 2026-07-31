package androidx.lifecycle;

import android.app.Application;
import b0.AbstractC1367a;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class Y {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f12614a;

    /* renamed from: b, reason: collision with root package name */
    private final b f12615b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1367a f12616c;

    public static class c implements b {

        /* renamed from: c, reason: collision with root package name */
        private static c f12625c;

        /* renamed from: a, reason: collision with root package name */
        public static final a f12624a = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final AbstractC1367a.b f12626d = a.C0110a.f12627a;

        public static final class a {

            /* renamed from: androidx.lifecycle.Y$c$a$a, reason: collision with other inner class name */
            private static final class C0110a implements AbstractC1367a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0110a f12627a = new C0110a();

                private C0110a() {
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                if (c.f12625c == null) {
                    c.f12625c = new c();
                }
                c cVar = c.f12625c;
                Intrinsics.checkNotNull(cVar);
                return cVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.Y.b
        public V create(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            try {
                Object newInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                modelC…wInstance()\n            }");
                return (V) newInstance;
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e6);
            }
        }
    }

    public static class d {
        public abstract void a(V v4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(b0 store, b factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public V a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    public V b(String key, Class modelClass) {
        V create;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        V b4 = this.f12614a.b(key);
        if (!modelClass.isInstance(b4)) {
            b0.b bVar = new b0.b(this.f12616c);
            bVar.c(c.f12626d, key);
            try {
                create = this.f12615b.create(modelClass, bVar);
            } catch (AbstractMethodError unused) {
                create = this.f12615b.create(modelClass);
            }
            this.f12614a.d(key, create);
            return create;
        }
        Object obj = this.f12615b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            Intrinsics.checkNotNull(b4);
            dVar.a(b4);
        }
        Intrinsics.checkNotNull(b4, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return b4;
    }

    public static class a extends c {

        /* renamed from: g, reason: collision with root package name */
        private static a f12618g;

        /* renamed from: e, reason: collision with root package name */
        private final Application f12620e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0108a f12617f = new C0108a(null);

        /* renamed from: h, reason: collision with root package name */
        public static final AbstractC1367a.b f12619h = C0108a.C0109a.f12621a;

        /* renamed from: androidx.lifecycle.Y$a$a, reason: collision with other inner class name */
        public static final class C0108a {

            /* renamed from: androidx.lifecycle.Y$a$a$a, reason: collision with other inner class name */
            private static final class C0109a implements AbstractC1367a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0109a f12621a = new C0109a();

                private C0109a() {
                }
            }

            public /* synthetic */ C0108a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(c0 owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                return owner instanceof InterfaceC1343i ? ((InterfaceC1343i) owner).getDefaultViewModelProviderFactory() : c.f12624a.a();
            }

            public final a b(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f12618g == null) {
                    a.f12618g = new a(application);
                }
                a aVar = a.f12618g;
                Intrinsics.checkNotNull(aVar);
                return aVar;
            }

            private C0108a() {
            }
        }

        private a(Application application, int i4) {
            this.f12620e = application;
        }

        private final V e(Class cls, Application application) {
            if (!AbstractC1335a.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                V v4 = (V) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(v4, "{\n                try {\n…          }\n            }");
                return v4;
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            }
        }

        @Override // androidx.lifecycle.Y.b
        public V create(Class modelClass, AbstractC1367a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f12620e != null) {
                return create(modelClass);
            }
            Application application = (Application) extras.a(f12619h);
            if (application != null) {
                return e(modelClass, application);
            }
            if (AbstractC1335a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.create(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.Y.c, androidx.lifecycle.Y.b
        public V create(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f12620e;
            if (application != null) {
                return e(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public Y(b0 store, b factory, AbstractC1367a defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f12614a = store;
        this.f12615b = factory;
        this.f12616c = defaultCreationExtras;
    }

    public interface b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12622b = a.f12623a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f12623a = new a();

            private a() {
            }
        }

        default V create(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default V create(Class modelClass, AbstractC1367a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return create(modelClass);
        }
    }

    public /* synthetic */ Y(b0 b0Var, b bVar, AbstractC1367a abstractC1367a, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(b0Var, bVar, (i4 & 4) != 0 ? AbstractC1367a.C0126a.f13298b : abstractC1367a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(c0 owner) {
        this(owner.getViewModelStore(), a.f12617f.a(owner), Z.a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(c0 owner, b factory) {
        this(owner.getViewModelStore(), factory, Z.a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
