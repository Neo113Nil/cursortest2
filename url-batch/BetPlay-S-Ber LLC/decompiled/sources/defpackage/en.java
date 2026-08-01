package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class en {
    private final m9 category;
    private final long createdAt;
    private final String id;
    private final String lastCompletedDate;
    private final String name;
    private final int streak;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ en(String str, String str2, m9 m9Var, int i, String str3, long j, int i2, je jeVar) {
        this(str, str2, m9Var, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? System.currentTimeMillis() : j);
        if ((i2 & 1) != 0) {
            str = UUID.randomUUID().toString();
            str.getClass();
        }
    }

    public static /* synthetic */ en copy$default(en enVar, String str, String str2, m9 m9Var, int i, String str3, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = enVar.id;
        }
        if ((i2 & 2) != 0) {
            str2 = enVar.name;
        }
        if ((i2 & 4) != 0) {
            m9Var = enVar.category;
        }
        if ((i2 & 8) != 0) {
            i = enVar.streak;
        }
        if ((i2 & 16) != 0) {
            str3 = enVar.lastCompletedDate;
        }
        if ((i2 & 32) != 0) {
            j = enVar.createdAt;
        }
        long j2 = j;
        String str4 = str3;
        m9 m9Var2 = m9Var;
        return enVar.copy(str, str2, m9Var2, i, str4, j2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final m9 component3() {
        return this.category;
    }

    public final int component4() {
        return this.streak;
    }

    public final String component5() {
        return this.lastCompletedDate;
    }

    public final long component6() {
        return this.createdAt;
    }

    public final en copy(String str, String str2, m9 m9Var, int i, String str3, long j) {
        str.getClass();
        str2.getClass();
        m9Var.getClass();
        str3.getClass();
        return new en(str, str2, m9Var, i, str3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en)) {
            return false;
        }
        en enVar = (en) obj;
        return op.d(this.id, enVar.id) && op.d(this.name, enVar.name) && this.category == enVar.category && this.streak == enVar.streak && op.d(this.lastCompletedDate, enVar.lastCompletedDate) && this.createdAt == enVar.createdAt;
    }

    public final m9 getCategory() {
        return this.category;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastCompletedDate() {
        return this.lastCompletedDate;
    }

    public final String getName() {
        return this.name;
    }

    public final int getStreak() {
        return this.streak;
    }

    public int hashCode() {
        return Long.hashCode(this.createdAt) + ((this.lastCompletedDate.hashCode() + ((Integer.hashCode(this.streak) + ((this.category.hashCode() + ((this.name.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isCompletedToday() {
        String str = this.lastCompletedDate;
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        format.getClass();
        return op.d(str, format);
    }

    public String toString() {
        return "Habit(id=" + this.id + ", name=" + this.name + ", category=" + this.category + ", streak=" + this.streak + ", lastCompletedDate=" + this.lastCompletedDate + ", createdAt=" + this.createdAt + ")";
    }

    public en(String str, String str2, m9 m9Var, int i, String str3, long j) {
        str.getClass();
        str2.getClass();
        m9Var.getClass();
        str3.getClass();
        this.id = str;
        this.name = str2;
        this.category = m9Var;
        this.streak = i;
        this.lastCompletedDate = str3;
        this.createdAt = j;
    }
}
