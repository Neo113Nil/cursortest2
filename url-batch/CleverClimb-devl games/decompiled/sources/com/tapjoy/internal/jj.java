package com.tapjoy.internal;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.NotificationCompatExtras;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class jj {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f8446a;

        /* renamed from: b, reason: collision with root package name */
        final jm[] f8447b;

        /* renamed from: c, reason: collision with root package name */
        final jm[] f8448c;

        /* renamed from: d, reason: collision with root package name */
        boolean f8449d;
        public int e;
        public CharSequence f;
        public PendingIntent g;
    }

    public static class c {
        Bundle A;
        Notification D;
        RemoteViews E;
        RemoteViews F;
        RemoteViews G;
        String H;
        String J;
        long K;

        @Deprecated
        public ArrayList N;

        /* renamed from: a, reason: collision with root package name */
        public Context f8450a;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f8452c;

        /* renamed from: d, reason: collision with root package name */
        CharSequence f8453d;
        PendingIntent e;
        PendingIntent f;
        RemoteViews g;
        Bitmap h;
        CharSequence i;
        int j;
        int k;
        boolean m;
        d n;
        CharSequence o;
        CharSequence[] p;
        int q;
        int r;
        boolean s;
        String t;
        boolean u;
        String v;
        boolean x;
        boolean y;
        String z;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f8451b = new ArrayList();
        boolean l = true;
        boolean w = false;
        int B = 0;
        int C = 0;
        int I = 0;
        int L = 0;
        Notification M = new Notification();

        public c(Context context, String str) {
            this.f8450a = context;
            this.H = str;
            this.M.when = System.currentTimeMillis();
            this.M.audioStreamType = -1;
            this.k = 0;
            this.N = new ArrayList();
        }

        public final c a(int i) {
            this.M.icon = i;
            return this;
        }

        public final c a(CharSequence charSequence) {
            this.f8452c = d(charSequence);
            return this;
        }

        public final c b(CharSequence charSequence) {
            this.f8453d = d(charSequence);
            return this;
        }

        public final c a(PendingIntent pendingIntent) {
            this.e = pendingIntent;
            return this;
        }

        public final c c(CharSequence charSequence) {
            this.M.tickerText = d(charSequence);
            return this;
        }

        public final c a(Bitmap bitmap) {
            this.h = bitmap;
            return this;
        }

        public final c b() {
            this.M.defaults = 1;
            return this;
        }

        public final c c() {
            this.k = 0;
            return this;
        }

        public final c a(d dVar) {
            if (this.n != dVar) {
                this.n = dVar;
                if (this.n != null) {
                    this.n.a(this);
                }
            }
            return this;
        }

        public final Notification d() {
            Notification notification;
            jk jkVar = new jk(this);
            d dVar = jkVar.f8459b.n;
            if (dVar != null) {
                dVar.a(jkVar);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                notification = jkVar.f8458a.build();
            } else if (Build.VERSION.SDK_INT >= 24) {
                notification = jkVar.f8458a.build();
                if (jkVar.g != 0) {
                    if (notification.getGroup() != null && (notification.flags & 512) != 0 && jkVar.g == 2) {
                        jk.a(notification);
                    }
                    if (notification.getGroup() != null && (notification.flags & 512) == 0 && jkVar.g == 1) {
                        jk.a(notification);
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                jkVar.f8458a.setExtras(jkVar.f);
                notification = jkVar.f8458a.build();
                if (jkVar.f8460c != null) {
                    notification.contentView = jkVar.f8460c;
                }
                if (jkVar.f8461d != null) {
                    notification.bigContentView = jkVar.f8461d;
                }
                if (jkVar.h != null) {
                    notification.headsUpContentView = jkVar.h;
                }
                if (jkVar.g != 0) {
                    if (notification.getGroup() != null && (notification.flags & 512) != 0 && jkVar.g == 2) {
                        jk.a(notification);
                    }
                    if (notification.getGroup() != null && (notification.flags & 512) == 0 && jkVar.g == 1) {
                        jk.a(notification);
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 20) {
                jkVar.f8458a.setExtras(jkVar.f);
                notification = jkVar.f8458a.build();
                if (jkVar.f8460c != null) {
                    notification.contentView = jkVar.f8460c;
                }
                if (jkVar.f8461d != null) {
                    notification.bigContentView = jkVar.f8461d;
                }
                if (jkVar.g != 0) {
                    if (notification.getGroup() != null && (notification.flags & 512) != 0 && jkVar.g == 2) {
                        jk.a(notification);
                    }
                    if (notification.getGroup() != null && (notification.flags & 512) == 0 && jkVar.g == 1) {
                        jk.a(notification);
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 19) {
                SparseArray<? extends Parcelable> a2 = jl.a(jkVar.e);
                if (a2 != null) {
                    jkVar.f.putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, a2);
                }
                jkVar.f8458a.setExtras(jkVar.f);
                notification = jkVar.f8458a.build();
                if (jkVar.f8460c != null) {
                    notification.contentView = jkVar.f8460c;
                }
                if (jkVar.f8461d != null) {
                    notification.bigContentView = jkVar.f8461d;
                }
            } else if (Build.VERSION.SDK_INT >= 16) {
                notification = jkVar.f8458a.build();
                Bundle a3 = jj.a(notification);
                Bundle bundle = new Bundle(jkVar.f);
                for (String str : jkVar.f.keySet()) {
                    if (a3.containsKey(str)) {
                        bundle.remove(str);
                    }
                }
                a3.putAll(bundle);
                SparseArray<? extends Parcelable> a4 = jl.a(jkVar.e);
                if (a4 != null) {
                    jj.a(notification).putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, a4);
                }
                if (jkVar.f8460c != null) {
                    notification.contentView = jkVar.f8460c;
                }
                if (jkVar.f8461d != null) {
                    notification.bigContentView = jkVar.f8461d;
                }
            } else {
                notification = jkVar.f8458a.getNotification();
            }
            if (jkVar.f8459b.E != null) {
                notification.contentView = jkVar.f8459b.E;
            }
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT >= 16 && dVar != null) {
                jj.a(notification);
            }
            return notification;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public final c a() {
            this.M.flags |= 16;
            return this;
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        protected c f8454a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f8455b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f8456c;

        /* renamed from: d, reason: collision with root package name */
        boolean f8457d = false;

        public void a(ji jiVar) {
        }

        public final void a(c cVar) {
            if (this.f8454a != cVar) {
                this.f8454a = cVar;
                if (this.f8454a != null) {
                    this.f8454a.a(this);
                }
            }
        }
    }

    public static class b extends d {
        private CharSequence e;

        public final b a(CharSequence charSequence) {
            this.f8455b = c.d(charSequence);
            return this;
        }

        public final b b(CharSequence charSequence) {
            this.e = c.d(charSequence);
            return this;
        }

        @Override // com.tapjoy.internal.jj.d
        public final void a(ji jiVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(jiVar.a()).setBigContentTitle(this.f8455b).bigText(this.e);
                if (this.f8457d) {
                    bigText.setSummaryText(this.f8456c);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return jl.a(notification);
        }
        return null;
    }
}
