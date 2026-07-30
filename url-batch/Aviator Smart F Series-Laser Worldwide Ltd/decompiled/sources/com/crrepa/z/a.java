package com.crrepa.z;

import android.os.Environment;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.z.c;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: e, reason: collision with root package name */
    private static final String f14056e = System.getProperty("line.separator");

    /* renamed from: f, reason: collision with root package name */
    private static final String f14057f = " <br> ";

    /* renamed from: g, reason: collision with root package name */
    private static final String f14058g = ",";

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Date f14059a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final SimpleDateFormat f14060b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final f f14061c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f14062d;

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f14063e = 512000;

        /* renamed from: a, reason: collision with root package name */
        Date f14064a;

        /* renamed from: b, reason: collision with root package name */
        SimpleDateFormat f14065b;

        /* renamed from: c, reason: collision with root package name */
        f f14066c;

        /* renamed from: d, reason: collision with root package name */
        String f14067d;

        private b() {
            this.f14067d = "PRETTY_LOGGER";
        }

        @NonNull
        public b a(@Nullable f fVar) {
            this.f14066c = fVar;
            return this;
        }

        @NonNull
        public b a(@Nullable String str) {
            this.f14067d = str;
            return this;
        }

        @NonNull
        public b a(@Nullable SimpleDateFormat simpleDateFormat) {
            this.f14065b = simpleDateFormat;
            return this;
        }

        @NonNull
        public b a(@Nullable Date date) {
            this.f14064a = date;
            return this;
        }

        @NonNull
        public a a() {
            if (this.f14064a == null) {
                this.f14064a = new Date();
            }
            if (this.f14065b == null) {
                this.f14065b = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS", Locale.UK);
            }
            if (this.f14066c == null) {
                String str = com.crrepa.g1.d.a().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS).getPath() + File.separatorChar + "logger";
                HandlerThread handlerThread = new HandlerThread("AndroidFileLogger." + str);
                handlerThread.start();
                this.f14066c = new c(new c.a(handlerThread.getLooper(), str, f14063e));
            }
            return new a(this);
        }
    }

    private a(@NonNull b bVar) {
        l.a(bVar);
        this.f14059a = bVar.f14064a;
        this.f14060b = bVar.f14065b;
        this.f14061c = bVar.f14066c;
        this.f14062d = bVar.f14067d;
    }

    @NonNull
    public static b a() {
        return new b().a("NY");
    }

    @Override // com.crrepa.z.d
    public void log(int i8, @Nullable String str, @NonNull String str2) {
        l.a(str2);
        String a8 = a(str);
        this.f14059a.setTime(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(this.f14059a.getTime()));
        sb.append(",");
        sb.append(this.f14060b.format(this.f14059a));
        sb.append(",");
        sb.append(l.a(i8));
        sb.append(",");
        sb.append(a8);
        String str3 = f14056e;
        if (str2.contains(str3)) {
            str2 = str2.replaceAll(str3, f14057f);
        }
        sb.append(",");
        sb.append(str2);
        sb.append(str3);
        this.f14061c.log(i8, a8, sb.toString());
    }

    @Nullable
    private String a(@Nullable String str) {
        if (l.a((CharSequence) str) || l.a(this.f14062d, str)) {
            return this.f14062d;
        }
        return this.f14062d + "-" + str;
    }
}
