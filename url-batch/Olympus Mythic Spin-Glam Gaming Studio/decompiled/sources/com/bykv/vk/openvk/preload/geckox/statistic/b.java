package com.bykv.vk.openvk.preload.geckox.statistic;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.c.b.b.f;
import com.bykv.vk.openvk.preload.geckox.c.e;
import com.bykv.vk.openvk.preload.geckox.c.g;
import com.bykv.vk.openvk.preload.geckox.c.h;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import java.util.Map;

/* compiled from: UpdateListeners.java */
/* loaded from: classes5.dex */
public final class b {
    private static com.bykv.vk.openvk.preload.a.b.a a(final com.bykv.vk.openvk.preload.geckox.b bVar) {
        return new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.1
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.a(bVar2, dVar);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f().put(dVar.getClass().getSimpleName() + "onStart", "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                try {
                    c.a(com.bykv.vk.openvk.preload.geckox.b.this, a.a(dVar.b()));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f().put(dVar.getClass().getSimpleName() + "onEnd", "");
                    if ((dVar instanceof e) && (dVar.f() instanceof Map)) {
                        com.bykv.vk.openvk.preload.geckox.b.this.f().put(dVar.getClass().getSimpleName(), ((Map) dVar.f()).get("f36c832c8dbb162c49b46a7a6dd47fbd"));
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f().put(dVar.getClass().getSimpleName() + "onException", th.toString());
                    c.a(com.bykv.vk.openvk.preload.geckox.b.this, a.a(dVar.b()));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.b(bVar2, dVar, th);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f().put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                    c.a(com.bykv.vk.openvk.preload.geckox.b.this, a.a(dVar.b()));
                } catch (Throwable unused) {
                }
            }
        };
    }

    private static com.bykv.vk.openvk.preload.a.b.a a(final Context context) {
        return new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.4
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                Pair pair = (Pair) bVar.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                a.t = ((Uri) pair.first).toString();
                a.n = com.bykv.vk.openvk.preload.geckox.utils.e.a(context);
                a.v = SystemClock.uptimeMillis();
                a.p = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                a.c = ((UpdatePackage) pair.second).getChannel();
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getAccessKey())) {
                    a.a = ((UpdatePackage) pair.second).getAccessKey();
                }
                if (TextUtils.isEmpty(((UpdatePackage) pair.second).getGroupName())) {
                    return;
                }
                a.b = ((UpdatePackage) pair.second).getGroupName();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar.b(g.class)).second).getChannel());
                a.z = true;
                a.w = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th) {
                super.a(bVar, dVar, th);
                Pair pair = (Pair) bVar.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                String uri = ((Uri) pair.first).toString();
                a.z = false;
                a.w = SystemClock.uptimeMillis();
                a.u.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(uri, th.getMessage()));
            }
        };
    }

    private static com.bykv.vk.openvk.preload.a.b.a b(final Context context) {
        return new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.5
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                Pair pair = (Pair) bVar.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                a.d = ((Uri) pair.first).toString();
                a.n = com.bykv.vk.openvk.preload.geckox.utils.e.a(context);
                a.f = SystemClock.uptimeMillis();
                a.o = Long.valueOf(((UpdatePackage) pair.second).getPatch().getId());
                a.p = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                a.c = ((UpdatePackage) pair.second).getChannel();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar.b(h.class)).second).getChannel());
                a.h = true;
                a.g = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th) {
                super.a(bVar, dVar, th);
                Pair pair = (Pair) bVar.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) pair.second).getChannel());
                String uri = ((Uri) pair.first).toString();
                a.h = false;
                a.g = SystemClock.uptimeMillis();
                a.e.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(uri, th.getMessage()));
            }
        };
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.a aVar, com.bykv.vk.openvk.preload.geckox.b bVar) {
        aVar.a(e.class, a(bVar));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.d.class, a(bVar));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.c.class, b(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.b.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).i = true;
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.i = false;
                SystemClock.uptimeMillis();
                a.q = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.d.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).j = true;
                SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.j = false;
                SystemClock.uptimeMillis();
                a.r = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.j = true;
                a.l = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.j = false;
                a.l = SystemClock.uptimeMillis();
                a.r = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.b.e.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.11
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.k = true;
                a.m = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.k = false;
                a.s = th.getMessage();
                a.m = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.a.b.class, a(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.a.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                a.A = true;
                a.x = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                a.A = false;
                a.x = SystemClock.uptimeMillis();
                a.C = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.a.a.c.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.10
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                a.B = true;
                a.y = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                a.B = false;
                a.y = SystemClock.uptimeMillis();
                a.D = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.c.class, b(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.b.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).i = true;
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.i = false;
                SystemClock.uptimeMillis();
                a.q = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.d.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel()).j = true;
                SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.j = false;
                SystemClock.uptimeMillis();
                a.r = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.b.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.j = true;
                a.l = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.j = false;
                a.l = SystemClock.uptimeMillis();
                a.r = th.getMessage();
            }
        });
        aVar.a(f.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.3
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.k = false;
                a.m = SystemClock.uptimeMillis();
                a.s = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.b(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.k = false;
                a.m = SystemClock.uptimeMillis();
                a.D = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(h.class)).second).getChannel());
                a.k = true;
                a.m = SystemClock.uptimeMillis();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.a.b.class, a(bVar.a()));
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.a.a.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                a.A = true;
                a.x = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                a.A = false;
                a.x = SystemClock.uptimeMillis();
                a.C = th.getMessage();
            }
        });
        aVar.a(com.bykv.vk.openvk.preload.geckox.c.b.a.d.class, new com.bykv.vk.openvk.preload.a.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.2
            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                a.B = false;
                a.y = SystemClock.uptimeMillis();
                a.D = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar, Throwable th) {
                super.b(bVar2, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                a.B = false;
                a.y = SystemClock.uptimeMillis();
                a.D = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.a.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.b()).a(((UpdatePackage) ((Pair) bVar2.b(g.class)).second).getChannel());
                a.B = true;
                a.y = SystemClock.uptimeMillis();
            }
        });
    }
}
