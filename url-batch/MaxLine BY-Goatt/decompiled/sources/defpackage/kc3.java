package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface kc3 {
    public static final qc3 e = new qc3();
    public static final hc3 f = new hc3();
    public static final vb3 g = new vb3("continue");
    public static final vb3 h = new vb3("break");
    public static final vb3 i = new vb3("return");
    public static final sb3 j = new sb3(Boolean.TRUE);
    public static final sb3 k = new sb3(Boolean.FALSE);
    public static final pc3 l = new pc3(BuildConfig.FLAVOR);

    Boolean a();

    Iterator e();

    Double f();

    kc3 j(String str, js0 js0Var, ArrayList arrayList);

    kc3 k();

    String zzc();
}
