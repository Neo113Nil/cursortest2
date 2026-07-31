package androidx.media2.session;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import q.d;

/* loaded from: classes.dex */
public final class SessionCommand implements a0.b {

    /* renamed from: d, reason: collision with root package name */
    static final SparseArray<List<Integer>> f1193d;

    /* renamed from: e, reason: collision with root package name */
    static final SparseArray<List<Integer>> f1194e;

    /* renamed from: f, reason: collision with root package name */
    static final SparseArray<List<Integer>> f1195f;

    /* renamed from: g, reason: collision with root package name */
    static final SparseArray<List<Integer>> f1196g;

    /* renamed from: h, reason: collision with root package name */
    static final SparseArray<List<Integer>> f1197h;

    /* renamed from: a, reason: collision with root package name */
    int f1198a;

    /* renamed from: b, reason: collision with root package name */
    String f1199b;

    /* renamed from: c, reason: collision with root package name */
    Bundle f1200c;

    static {
        SparseArray<List<Integer>> sparseArray = new SparseArray<>();
        f1193d = sparseArray;
        SparseArray<List<Integer>> sparseArray2 = new SparseArray<>();
        f1194e = sparseArray2;
        sparseArray.put(1, Arrays.asList(10000, 10001, 10002, 10003, 10004, 11000, 11001, 11002));
        sparseArray2.put(1, Arrays.asList(10005, 10006, 10007, 10008, 10009, 10010, 10011, 10012, 10013, 10014, 10015, 10016, 10017, 10018));
        sparseArray2.put(2, Collections.singletonList(10019));
        SparseArray<List<Integer>> sparseArray3 = new SparseArray<>();
        f1195f = sparseArray3;
        sparseArray3.put(1, Arrays.asList(30000, 30001));
        SparseArray<List<Integer>> sparseArray4 = new SparseArray<>();
        f1196g = sparseArray4;
        sparseArray4.put(1, Arrays.asList(40000, 40001, 40002, 40003, 40010));
        sparseArray4.put(2, Collections.singletonList(40011));
        SparseArray<List<Integer>> sparseArray5 = new SparseArray<>();
        f1197h = sparseArray5;
        sparseArray5.put(1, Arrays.asList(50000, 50001, 50002, 50003, 50004, 50005, 50006));
    }

    SessionCommand() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionCommand)) {
            return false;
        }
        SessionCommand sessionCommand = (SessionCommand) obj;
        return this.f1198a == sessionCommand.f1198a && TextUtils.equals(this.f1199b, sessionCommand.f1199b);
    }

    public int hashCode() {
        return d.b(this.f1199b, Integer.valueOf(this.f1198a));
    }
}
