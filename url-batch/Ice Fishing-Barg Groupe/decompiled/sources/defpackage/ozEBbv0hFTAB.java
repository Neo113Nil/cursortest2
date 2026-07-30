package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class ozEBbv0hFTAB implements le0 {
    public final /* synthetic */ Collection OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ ozEBbv0hFTAB(int i, Collection collection) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = collection;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        boolean contains;
        int i = this.rtx2ld2ELZv4;
        Collection<?> collection = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
