package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.internal.ads.FK;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Y extends Writer {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5035n;

    /* renamed from: u, reason: collision with root package name */
    public final StringBuilder f5036u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f5037v;

    public Y(StringBuilder sb) {
        this.f5035n = 1;
        this.f5037v = new FK();
        this.f5036u = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.f5035n) {
            case 1:
                this.f5036u.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f5035n) {
            case 0:
                z();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f5035n) {
            case 0:
                z();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i4) {
        switch (this.f5035n) {
            case 0:
                for (int i9 = 0; i9 < i4; i9++) {
                    char c4 = cArr[i + i9];
                    if (c4 == '\n') {
                        z();
                    } else {
                        this.f5036u.append(c4);
                    }
                }
                break;
            default:
                FK fk = (FK) this.f5037v;
                fk.f24948n = cArr;
                fk.f24949u = null;
                this.f5036u.append((CharSequence) fk, i, i4 + i);
                break;
        }
    }

    public void z() {
        StringBuilder sb = this.f5036u;
        if (sb.length() > 0) {
            Log.d((String) this.f5037v, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f5035n) {
            case 1:
                append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i4) {
        switch (this.f5035n) {
            case 1:
                this.f5036u.append(charSequence, i, i4);
                return this;
            default:
                return super.append(charSequence, i, i4);
        }
    }

    public Y() {
        this.f5035n = 0;
        this.f5036u = new StringBuilder(128);
        this.f5037v = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i4) {
        switch (this.f5035n) {
            case 1:
                append(charSequence, i, i4);
                return this;
            default:
                return super.append(charSequence, i, i4);
        }
    }

    @Override // java.io.Writer
    public void write(int i) {
        switch (this.f5035n) {
            case 1:
                this.f5036u.append((char) i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i4) {
        switch (this.f5035n) {
            case 1:
                Objects.requireNonNull(str);
                this.f5036u.append((CharSequence) str, i, i4 + i);
                break;
            default:
                super.write(str, i, i4);
                break;
        }
    }

    private final void b() {
    }

    private final void j() {
    }
}
