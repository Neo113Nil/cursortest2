package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fd2 {
    public static final bd2 Companion = new bd2();
    public final String PxuCJdSBwIXG;
    public final Set TSizfFm2Yiuu;
    public final Set Y1f8riQaR6yg;
    public final Map lS5Rgt96tfkO;

    public fd2(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = map;
        this.TSizfFm2Yiuu = abstractSet;
        this.Y1f8riQaR6yg = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd2)) {
            return false;
        }
        fd2 fd2Var = (fd2) obj;
        if (!this.PxuCJdSBwIXG.equals(fd2Var.PxuCJdSBwIXG) || !this.lS5Rgt96tfkO.equals(fd2Var.lS5Rgt96tfkO) || !cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, fd2Var.TSizfFm2Yiuu)) {
            return false;
        }
        Set set2 = this.Y1f8riQaR6yg;
        if (set2 == null || (set = fd2Var.Y1f8riQaR6yg) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.PxuCJdSBwIXG);
        sb.append("',\n            |    columns = {");
        sb.append(vi0.S9EYkSpbGuxq(zk.d(this.lS5Rgt96tfkO.values(), new db0(12))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(vi0.S9EYkSpbGuxq(this.TSizfFm2Yiuu));
        sb.append("\n            |    indices = {");
        Set set = this.Y1f8riQaR6yg;
        sb.append(vi0.S9EYkSpbGuxq(set != null ? zk.d(set, new db0(13)) : p50.rtx2ld2ELZv4));
        sb.append("\n            |}\n        ");
        return ja2.zf8DYfih6EZu(sb.toString());
    }
}
