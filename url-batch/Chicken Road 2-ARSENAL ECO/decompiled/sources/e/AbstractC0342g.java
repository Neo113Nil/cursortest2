package e;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: e.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0342g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3998a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3999b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4000c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4001d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f4002e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4003f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f4004g = new Bundle();

    public final boolean a(int i7, int i8, Intent intent) {
        String str = (String) this.f3998a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        this.f4003f.remove(str);
        this.f4004g.putParcelable(str, new C0336a(i8, intent));
        return true;
    }
}
