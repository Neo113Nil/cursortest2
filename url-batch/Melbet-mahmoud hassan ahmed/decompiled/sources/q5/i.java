package q5;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import c4.w0;
import e5.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import q5.h;

/* loaded from: classes.dex */
public class i implements e5.a, h.a {

    /* renamed from: f, reason: collision with root package name */
    private Context f20369f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20370a;

        static {
            int[] iArr = new int[h.c.values().length];
            f20370a = iArr;
            try {
                iArr[h.c.root.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20370a[h.c.music.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20370a[h.c.podcasts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20370a[h.c.ringtones.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20370a[h.c.alarms.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20370a[h.c.notifications.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20370a[h.c.pictures.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20370a[h.c.movies.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20370a[h.c.downloads.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20370a[h.c.dcim.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20370a[h.c.documents.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private String h() {
        return u5.b.d(this.f20369f);
    }

    private String j() {
        return u5.b.c(this.f20369f);
    }

    private List<String> k() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f20369f.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.f20369f.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List<String> l(h.c cVar) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f20369f.getExternalFilesDirs(o(cVar))) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.f20369f.getExternalFilesDir(o(cVar));
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private String m() {
        File externalFilesDir = this.f20369f.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String n() {
        return this.f20369f.getCacheDir().getPath();
    }

    private String o(h.c cVar) {
        switch (a.f20370a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case w0.f2149o /* 7 */:
                return "pictures";
            case w0.f2150p /* 8 */:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }

    private void p(m5.c cVar, Context context) {
        cVar.b();
        try {
            g.n(cVar, this);
        } catch (Exception e7) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e7);
        }
        this.f20369f = context;
    }

    @Override // q5.h.a
    public String a() {
        return n();
    }

    @Override // q5.h.a
    public String b() {
        return j();
    }

    @Override // q5.h.a
    public List<String> c() {
        return k();
    }

    @Override // q5.h.a
    public String d() {
        return h();
    }

    @Override // q5.h.a
    public List<String> e(h.c cVar) {
        return l(cVar);
    }

    @Override // e5.a
    public void f(a.b bVar) {
        p(bVar.b(), bVar.a());
    }

    @Override // q5.h.a
    public String g() {
        return m();
    }

    @Override // e5.a
    public void i(a.b bVar) {
        g.n(bVar.b(), null);
    }
}
