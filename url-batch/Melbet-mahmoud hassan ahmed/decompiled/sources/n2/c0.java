package n2;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c0 extends a0 {

    /* renamed from: i, reason: collision with root package name */
    public final int f19398i;

    /* renamed from: j, reason: collision with root package name */
    public final String f19399j;

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, List<String>> f19400k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f19401l;

    public c0(int i7, String str, IOException iOException, Map<String, List<String>> map, p pVar, byte[] bArr) {
        super("Response code: " + i7, iOException, pVar, 2004, 1);
        this.f19398i = i7;
        this.f19399j = str;
        this.f19400k = map;
        this.f19401l = bArr;
    }
}
