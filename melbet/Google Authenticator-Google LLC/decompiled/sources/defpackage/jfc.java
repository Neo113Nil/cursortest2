package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.mlkit.vision.codescanner.internal.GmsBarcodeScanningDelegateActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfc implements jey {
    static final AtomicReference a = new AtomicReference();
    public static final Object b = new Object();
    public static boolean c;
    public final Context d;
    private final jeb e;
    private final ikm f;

    public jfc(Context context) {
        ikm ikmVar = new ikm(context);
        this.e = ksl.l("play-services-code-scanner");
        this.d = context;
        this.f = ikmVar;
    }

    public static void d(ikk ikkVar, int i) {
        Pair pair = (Pair) a.getAndSet(null);
        if (pair == null) {
            Log.e("GmsBarcodeScannerImpl", "Scanning task source doesn't exist when setting back result.");
            return;
        }
        if (ikkVar != null) {
            ((bst) pair.first).c(ikkVar);
        } else if (i == 201) {
            ((bry) pair.second).a();
        } else {
            ((bst) pair.first).b(new ike("Failed to scan code.", i));
        }
    }

    @Override // defpackage.cmx
    public final cli[] a() {
        return new cli[]{ikw.i};
    }

    @Override // defpackage.jey
    public final ddi b() {
        int i = clm.c;
        Context context = this.d;
        if (cmd.a(context) >= 221500000) {
            return new csg(context).a(new jfa()).b(ddl.a, new ddh() { // from class: jfb
                /* JADX WARN: Removed duplicated region for block: B:8:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // defpackage.ddh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final ddi a(Object obj) {
                    boolean z;
                    Object obj2;
                    boolean z2 = ((crx) obj).a;
                    final jfc jfcVar = jfc.this;
                    if (z2) {
                        if (new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_BARCODE").resolveActivity(jfcVar.d.getApplicationContext().getPackageManager()) != null) {
                            z = true;
                            synchronized (jfc.b) {
                                final long elapsedRealtime = SystemClock.elapsedRealtime();
                                final long currentTimeMillis = System.currentTimeMillis();
                                if (z) {
                                    AtomicReference atomicReference = jfc.a;
                                    Pair pair = (Pair) atomicReference.getAndSet(null);
                                    if (pair != null) {
                                        ((bry) pair.second).a();
                                    }
                                    bry bryVar = new bry();
                                    bst bstVar = new bst((bry) bryVar.a);
                                    atomicReference.set(new Pair(bstVar, bryVar));
                                    Context context2 = jfcVar.d;
                                    Intent intent = new Intent(context2, (Class<?>) GmsBarcodeScanningDelegateActivity.class);
                                    intent.putExtra("extra_supported_formats", 0);
                                    intent.putExtra("extra_allow_manual_input", false);
                                    intent.putExtra("extra_enable_auto_zoom", false);
                                    intent.setFlags(268435456);
                                    context2.startActivity(intent);
                                    obj2 = bstVar.a;
                                    ((ddi) obj2).l(new ddc() { // from class: jez
                                        @Override // defpackage.ddc
                                        public final void a(ddi ddiVar) {
                                            int i2;
                                            if (((ddm) ddiVar).c) {
                                                i2 = 201;
                                            } else if (ddiVar.f()) {
                                                i2 = 0;
                                            } else {
                                                ike ikeVar = (ike) ddiVar.c();
                                                oy.at(ikeVar);
                                                i2 = ikeVar.a;
                                            }
                                            int i3 = i2;
                                            long j = currentTimeMillis;
                                            jfc.this.c(i3, elapsedRealtime, j);
                                        }
                                    });
                                } else {
                                    if (!jfc.c) {
                                        Context context3 = jfcVar.d;
                                        cli cliVar = ikw.a;
                                        hel q = hel.q("barcode_ui");
                                        int i2 = clm.c;
                                        if (cmd.a(context3) >= 221500000) {
                                            her herVar = ikw.k;
                                            int i3 = ((his) q).c;
                                            final cli[] cliVarArr = new cli[i3];
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                cli cliVar2 = (cli) herVar.get(q.get(i4));
                                                oy.at(cliVar2);
                                                cliVarArr[i4] = cliVar2;
                                            }
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(new cmx() { // from class: iku
                                                @Override // defpackage.cmx
                                                public final cli[] a() {
                                                    cli cliVar3 = ikw.a;
                                                    return cliVarArr;
                                                }
                                            });
                                            new csg(context3).b(new cfe((List) arrayList)).m(new ikv());
                                        } else {
                                            Intent intent2 = new Intent();
                                            intent2.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                                            intent2.setAction("com.google.android.gms.vision.DEPENDENCY");
                                            intent2.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", q));
                                            intent2.putExtra("requester_app_package", context3.getApplicationInfo().packageName);
                                            context3.sendBroadcast(intent2);
                                        }
                                        jfc.c = true;
                                    }
                                    jfcVar.c(200, elapsedRealtime, currentTimeMillis);
                                    obj2 = dih.v(new ike("Waiting for the Barcode UI module to be downloaded.", 200));
                                }
                            }
                            return (ddi) obj2;
                        }
                    }
                    z = false;
                    synchronized (jfc.b) {
                    }
                }
            });
        }
        c(207, SystemClock.elapsedRealtime(), System.currentTimeMillis());
        return dih.v(new ike("Code scanner module is not supported on current Google Play Services version, please upgrade.", 207));
    }

    final void c(int i, long j, long j2) {
        iyf iyfVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        iyh iyhVar = new iyh();
        jyh jyhVar = new jyh();
        Integer num = 0;
        num.getClass();
        jyhVar.c = num;
        jyhVar.d = false;
        long j3 = elapsedRealtime - j;
        Long.valueOf(j3).getClass();
        jyhVar.a = Long.valueOf(j3 & Long.MAX_VALUE);
        if (i == 0) {
            iyfVar = iyf.NO_ERROR;
        } else if (i != 207) {
            switch (i) {
                case 200:
                    iyfVar = iyf.CODE_SCANNER_UNAVAILABLE;
                    break;
                case 201:
                    iyfVar = iyf.CODE_SCANNER_CANCELLED;
                    break;
                case 202:
                    iyfVar = iyf.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED;
                    break;
                case 203:
                    iyfVar = iyf.CODE_SCANNER_APP_NAME_UNAVAILABLE;
                    break;
                case 204:
                    iyfVar = iyf.CODE_SCANNER_TASK_IN_PROGRESS;
                    break;
                case 205:
                    iyfVar = iyf.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
                    break;
                default:
                    iyfVar = iyf.UNKNOWN_ERROR;
                    break;
            }
        } else {
            iyfVar = iyf.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD;
        }
        jeb jebVar = this.e;
        jyhVar.b = iyfVar;
        iyhVar.c = new iwq(jyhVar);
        jed jedVar = new jed(iyhVar);
        iyg iygVar = iyg.CODE_SCANNER_SCAN_API;
        ddi ddiVar = jebVar.e;
        ikq.a.execute(new fv(jebVar, jedVar, iygVar, ddiVar.f() ? (String) ddiVar.d() : cqw.a.a(jebVar.g), 9, null));
        this.f.a(i, j2, currentTimeMillis);
    }
}
