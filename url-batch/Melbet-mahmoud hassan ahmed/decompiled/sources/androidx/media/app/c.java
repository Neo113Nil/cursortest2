package androidx.media.app;

import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.media.i;
import androidx.media.j;
import androidx.media.k;
import j.d;
import j.e;

/* loaded from: classes.dex */
public class c extends e.AbstractC0081e {

    /* renamed from: e, reason: collision with root package name */
    int[] f974e = null;

    /* renamed from: f, reason: collision with root package name */
    MediaSessionCompat.Token f975f;

    /* renamed from: g, reason: collision with root package name */
    boolean f976g;

    /* renamed from: h, reason: collision with root package name */
    PendingIntent f977h;

    private RemoteViews o(e.a aVar) {
        boolean z6 = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f18020a.f17994a.getPackageName(), k.f1098a);
        int i7 = i.f1092a;
        remoteViews.setImageViewResource(i7, aVar.e());
        if (!z6) {
            remoteViews.setOnClickPendingIntent(i7, aVar.a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            a.a(remoteViews, i7, aVar.j());
        }
        return remoteViews;
    }

    @Override // j.e.AbstractC0081e
    public void b(d dVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.d(dVar.a(), b.b(b.a(), this.f974e, this.f975f));
        } else if (this.f976g) {
            dVar.a().setOngoing(true);
        }
    }

    @Override // j.e.AbstractC0081e
    public RemoteViews i(d dVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return m();
    }

    @Override // j.e.AbstractC0081e
    public RemoteViews j(d dVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return n();
    }

    RemoteViews m() {
        int min = Math.min(this.f18020a.f17995b.size(), 5);
        RemoteViews c7 = c(false, p(min), false);
        c7.removeAllViews(i.f1095d);
        if (min > 0) {
            for (int i7 = 0; i7 < min; i7++) {
                c7.addView(i.f1095d, o(this.f18020a.f17995b.get(i7)));
            }
        }
        if (this.f976g) {
            int i8 = i.f1093b;
            c7.setViewVisibility(i8, 0);
            c7.setInt(i8, "setAlpha", this.f18020a.f17994a.getResources().getInteger(j.f1097a));
            c7.setOnClickPendingIntent(i8, this.f977h);
        } else {
            c7.setViewVisibility(i.f1093b, 8);
        }
        return c7;
    }

    RemoteViews n() {
        RemoteViews c7 = c(false, q(), true);
        int size = this.f18020a.f17995b.size();
        int[] iArr = this.f974e;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        c7.removeAllViews(i.f1095d);
        if (min > 0) {
            for (int i7 = 0; i7 < min; i7++) {
                if (i7 >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i7), Integer.valueOf(size - 1)));
                }
                c7.addView(i.f1095d, o(this.f18020a.f17995b.get(this.f974e[i7])));
            }
        }
        if (this.f976g) {
            c7.setViewVisibility(i.f1094c, 8);
            int i8 = i.f1093b;
            c7.setViewVisibility(i8, 0);
            c7.setOnClickPendingIntent(i8, this.f977h);
            c7.setInt(i8, "setAlpha", this.f18020a.f17994a.getResources().getInteger(j.f1097a));
        } else {
            c7.setViewVisibility(i.f1094c, 0);
            c7.setViewVisibility(i.f1093b, 8);
        }
        return c7;
    }

    int p(int i7) {
        return i7 <= 3 ? k.f1100c : k.f1099b;
    }

    int q() {
        return k.f1101d;
    }

    public c r(PendingIntent pendingIntent) {
        this.f977h = pendingIntent;
        return this;
    }

    public c s(MediaSessionCompat.Token token) {
        this.f975f = token;
        return this;
    }

    public c t(int... iArr) {
        this.f974e = iArr;
        return this;
    }

    public c u(boolean z6) {
        if (Build.VERSION.SDK_INT < 21) {
            this.f976g = z6;
        }
        return this;
    }
}
