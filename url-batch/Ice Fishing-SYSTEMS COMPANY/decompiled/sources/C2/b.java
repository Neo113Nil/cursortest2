package C2;

import android.net.Uri;
import android.text.TextUtils;
import androidx.emoji2.text.o;
import androidx.emoji2.text.u;
import com.google.android.gms.internal.ads.PA;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: n, reason: collision with root package name */
    public final String f377n;

    public b() {
        this.f377n = (String) PA.f26853D.r();
    }

    public String a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f377n).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @Override // androidx.emoji2.text.o
    public boolean f(CharSequence charSequence, int i, int i4, u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i4), this.f377n)) {
            return true;
        }
        uVar.f4918c = (uVar.f4918c & 3) | 4;
        return false;
    }

    public b(String str) {
        this.f377n = str;
    }

    @Override // androidx.emoji2.text.o
    public Object getResult() {
        return this;
    }
}
