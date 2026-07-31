package C2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class N extends AbstractC0316j0 {

    /* renamed from: c, reason: collision with root package name */
    private final A2.f f226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC3527b kSerializer, InterfaceC3527b vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f226c = new M(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // C2.AbstractC0316j0, y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return this.f226c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap a() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return hashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashMap hashMap, int i4) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator d(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashMap k(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        HashMap hashMap = map instanceof HashMap ? (HashMap) map : null;
        return hashMap == null ? new HashMap(map) : hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map l(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return hashMap;
    }
}
