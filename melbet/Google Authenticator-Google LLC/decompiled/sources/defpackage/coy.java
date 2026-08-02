package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class coy extends dcr implements cmt, cmu {
    private static final ox h = dco.a;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final cpr d;
    public dcu e;
    public coe f;
    public final ox g;

    public coy(Context context, Handler handler, cpr cprVar) {
        ox oxVar = h;
        this.a = context;
        this.b = handler;
        this.d = cprVar;
        this.c = cprVar.b;
        this.g = oxVar;
    }

    @Override // defpackage.cnx
    public final void a(Bundle bundle) {
        GoogleSignInAccount googleSignInAccount;
        dcu dcuVar = this.e;
        try {
            Account account = dcuVar.v.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = dcuVar.b;
                ciy.a.lock();
                try {
                    if (ciy.b == null) {
                        ciy.b = new ciy(context.getApplicationContext());
                    }
                    ciy ciyVar = ciy.b;
                    ciy.a.unlock();
                    String a = ciyVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a)) {
                        String a2 = ciyVar.a("googleSignInAccount:" + a);
                        if (a2 != null) {
                            if (!TextUtils.isEmpty(a2)) {
                                JSONObject jSONObject = new JSONObject(a2);
                                String optString = jSONObject.optString("photoUrl");
                                Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
                                long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                                HashSet hashSet = new HashSet();
                                JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                                int i = 0;
                                for (int length = jSONArray.length(); i < length; length = length) {
                                    hashSet.add(new Scope(1, jSONArray.getString(i)));
                                    i++;
                                }
                                String optString2 = jSONObject.optString("id");
                                String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                                String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                                String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                                String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                                String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                                Long valueOf = Long.valueOf(parseLong);
                                String string = jSONObject.getString("obfuscatedIdentifier");
                                valueOf.getClass();
                                oy.ar(string);
                                googleSignInAccount = new GoogleSignInAccount(optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
                                googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                                Integer num = dcuVar.w;
                                oy.at(num);
                                crb crbVar = new crb(2, account, num.intValue(), googleSignInAccount);
                                dcs dcsVar = (dcs) dcuVar.v();
                                dcv dcvVar = new dcv(1, crbVar);
                                Parcel a3 = dcsVar.a();
                                bmt.c(a3, dcvVar);
                                bmt.d(a3, this);
                                dcsVar.c(12, a3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    ciy.a.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = dcuVar.w;
            oy.at(num2);
            crb crbVar2 = new crb(2, account, num2.intValue(), googleSignInAccount);
            dcs dcsVar2 = (dcs) dcuVar.v();
            dcv dcvVar2 = new dcv(1, crbVar2);
            Parcel a32 = dcsVar2.a();
            bmt.c(a32, dcvVar2);
            bmt.d(a32, this);
            dcsVar2.c(12, a32);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                c(new dcw(1, new clg(1, 8, null, null, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.cnx
    public final void b(int i) {
        coe coeVar = this.f;
        coc cocVar = (coc) coeVar.e.k.get(coeVar.b);
        if (cocVar != null) {
            if (cocVar.g) {
                cocVar.l(new clg(1, 17, null, null, null));
            } else {
                cocVar.b(i);
            }
        }
    }

    @Override // defpackage.dcr
    public final void c(dcw dcwVar) {
        this.b.post(new avl(this, dcwVar, 12, (int[]) null));
    }

    @Override // defpackage.cot
    public final void i(clg clgVar) {
        this.f.b(clgVar);
    }
}
