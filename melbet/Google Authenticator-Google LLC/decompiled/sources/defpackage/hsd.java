package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsd implements Comparable, Serializable {
    private static final long serialVersionUID = -1105194233979842380L;
    public final String a;
    public transient Charset b;
    public volatile transient hsf c;
    volatile transient String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public hsd(String str, String str2, String str3, String str4, String str5, Charset charset) {
        this.e = a(str);
        this.f = str2;
        this.g = str3;
        this.a = str4;
        this.h = str5;
        this.b = charset;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ENGLISH);
    }

    private static String b(String str, String str2) {
        return str != null ? str2 : "";
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        this.b = Charset.forName((String) readObject);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b.name());
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        hsd hsdVar = (hsd) obj;
        hsdVar.getClass();
        return toString().compareTo(hsdVar.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hsd) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        if (this.d != null) {
            return this.d;
        }
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        String str4 = this.a;
        String str5 = this.h;
        String str6 = hoq.R(str) + b(str, ":") + b(str2, "//") + hoq.R(str2) + hoq.R(str3) + b(str4, "?") + hoq.R(str4) + b(str5, "#") + hoq.R(str5);
        this.d = str6;
        return str6;
    }

    public hsd(String str, String str2, String str3, String str4, String str5, Charset charset, String str6) {
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.a = str4;
        this.h = str5;
        this.b = charset;
        this.d = str6;
    }
}
