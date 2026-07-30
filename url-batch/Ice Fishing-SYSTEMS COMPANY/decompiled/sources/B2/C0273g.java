package B2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.C2511Cp;
import com.google.android.gms.internal.ads.C2687Ne;
import com.google.android.gms.internal.ads.C3686oN;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.XA;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;
import q2.C4907p;

/* renamed from: B2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0273g implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f231b;

    public /* synthetic */ C0273g(int i, Object obj) {
        this.f230a = i;
        this.f231b = obj;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        switch (this.f230a) {
            case 0:
                final ArrayList arrayList = (ArrayList) obj;
                final BinderC0278l binderC0278l = (BinderC0278l) this.f231b;
                return C3686oN.A(binderC0278l.M3("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new XA() { // from class: B2.h
                    @Override // com.google.android.gms.internal.ads.XA
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        BinderC0278l binderC0278l2 = BinderC0278l.this;
                        binderC0278l2.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (Uri uri : arrayList) {
                            if (!BinderC0278l.K3(uri, binderC0278l2.f262S, binderC0278l2.f263T) || TextUtils.isEmpty(str)) {
                                arrayList2.add(uri);
                            } else {
                                arrayList2.add(BinderC0278l.N3(uri, "nas", str));
                            }
                        }
                        return arrayList2;
                    }
                }, binderC0278l.f274z);
            case 1:
                final Uri uri = (Uri) obj;
                BinderC0278l binderC0278l2 = (BinderC0278l) this.f231b;
                return C3686oN.A(binderC0278l2.M3("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new XA() { // from class: B2.i
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean isEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        return !isEmpty ? BinderC0278l.N3(uri2, "nas", str) : uri2;
                    }
                }, binderC0278l2.f274z);
            default:
                C2511Cp c2511Cp = (C2511Cp) obj;
                u uVar = new u(new JsonReader(new InputStreamReader(c2511Cp.f24249a)), c2511Cp.f24250b);
                try {
                    uVar.f304b = C4907p.f40108g.f40109a.m(((C2687Ne) this.f231b).f26579n).toString();
                } catch (JSONException unused) {
                    uVar.f304b = "{}";
                }
                return C3686oN.c(uVar);
        }
    }
}
