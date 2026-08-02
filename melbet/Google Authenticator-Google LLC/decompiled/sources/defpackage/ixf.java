package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ixf {
    public static Class f(ktj ktjVar) {
        ktjVar.getClass();
        return ((ksi) ktjVar).a();
    }

    public static Class g(ktj ktjVar) {
        String name;
        ktjVar.getClass();
        Class a = ((ksi) ktjVar).a();
        if (!a.isPrimitive() || (name = a.getName()) == null) {
            return a;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : a;
            case 104431:
                return name.equals("int") ? Integer.class : a;
            case 3039496:
                return name.equals("byte") ? Byte.class : a;
            case 3052374:
                return name.equals("char") ? Character.class : a;
            case 3327612:
                return name.equals("long") ? Long.class : a;
            case 3625364:
                return name.equals("void") ? Void.class : a;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : a;
            case 97526364:
                return name.equals("float") ? Float.class : a;
            case 109413500:
                return name.equals("short") ? Short.class : a;
            default:
                return a;
        }
    }

    public static ktj h(Class cls) {
        cls.getClass();
        int i = ksx.a;
        return new ksj(cls);
    }

    public static void i(AutoCloseable autoCloseable, Throwable th) {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            koc.b(th, th2);
        }
    }

    public static void j(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                koc.b(th, th2);
            }
        }
    }

    public static krb k(Enum[] enumArr) {
        enumArr.getClass();
        return new krc(enumArr);
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void e() {
    }

    public void d(Object obj) {
    }
}
