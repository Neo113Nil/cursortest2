package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hhy extends han {
    private static final long serialVersionUID = 0;
    transient hac d;

    public hhy(Map map, hac hacVar) {
        super(map);
        this.d = hacVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        this.d = (hac) readObject;
        Object readObject2 = objectInputStream.readObject();
        readObject2.getClass();
        l((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.d);
        objectOutputStream.writeObject(((hbg) this).a);
    }

    @Override // defpackage.han, defpackage.hbg
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.d.bB();
    }

    @Override // defpackage.hbg, defpackage.hbo
    public final Map i() {
        Map map = ((hbg) this).a;
        return map instanceof NavigableMap ? new haw(this, (NavigableMap) map) : map instanceof SortedMap ? new haz(this, (SortedMap) map) : new has(this, map);
    }

    @Override // defpackage.hbg, defpackage.hbo
    public final Set j() {
        Map map = ((hbg) this).a;
        return map instanceof NavigableMap ? new hax(this, (NavigableMap) map) : map instanceof SortedMap ? new hba(this, (SortedMap) map) : new hav(this, map);
    }
}
