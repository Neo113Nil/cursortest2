package com.trembin.nirefon.betfury.data;

import defpackage.di;
import defpackage.mv;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class Note {
    private final String content;
    private final long createdAt;
    private final int id;
    private final boolean isPinned;
    private final Priority priority;
    private final Long reminderTime;
    private final String title;
    private final long updatedAt;

    public /* synthetic */ Note(int i, String str, String str2, Priority priority, boolean z, Long l, long j, long j2, int i2, di diVar) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, (i2 & 8) != 0 ? Priority.LOW : priority, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : l, (i2 & 64) != 0 ? System.currentTimeMillis() : j, (i2 & 128) != 0 ? System.currentTimeMillis() : j2);
    }

    public static /* synthetic */ Note copy$default(Note note, int i, String str, String str2, Priority priority, boolean z, Long l, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = note.id;
        }
        if ((i2 & 2) != 0) {
            str = note.title;
        }
        if ((i2 & 4) != 0) {
            str2 = note.content;
        }
        if ((i2 & 8) != 0) {
            priority = note.priority;
        }
        if ((i2 & 16) != 0) {
            z = note.isPinned;
        }
        if ((i2 & 32) != 0) {
            l = note.reminderTime;
        }
        if ((i2 & 64) != 0) {
            j = note.createdAt;
        }
        if ((i2 & 128) != 0) {
            j2 = note.updatedAt;
        }
        long j3 = j2;
        long j4 = j;
        boolean z2 = z;
        Long l2 = l;
        return note.copy(i, str, str2, priority, z2, l2, j4, j3);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.content;
    }

    public final Priority component4() {
        return this.priority;
    }

    public final boolean component5() {
        return this.isPinned;
    }

    public final Long component6() {
        return this.reminderTime;
    }

    public final long component7() {
        return this.createdAt;
    }

    public final long component8() {
        return this.updatedAt;
    }

    public final Note copy(int i, String str, String str2, Priority priority, boolean z, Long l, long j, long j2) {
        str.getClass();
        str2.getClass();
        priority.getClass();
        return new Note(i, str, str2, priority, z, l, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Note)) {
            return false;
        }
        Note note = (Note) obj;
        return this.id == note.id && mv.c(this.title, note.title) && mv.c(this.content, note.content) && this.priority == note.priority && this.isPinned == note.isPinned && mv.c(this.reminderTime, note.reminderTime) && this.createdAt == note.createdAt && this.updatedAt == note.updatedAt;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.id;
    }

    public final Priority getPriority() {
        return this.priority;
    }

    public final Long getReminderTime() {
        return this.reminderTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = (Boolean.hashCode(this.isPinned) + ((this.priority.hashCode() + ((this.content.hashCode() + ((this.title.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31;
        Long l = this.reminderTime;
        return Long.hashCode(this.updatedAt) + ((Long.hashCode(this.createdAt) + ((hashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public String toString() {
        return "Note(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", priority=" + this.priority + ", isPinned=" + this.isPinned + ", reminderTime=" + this.reminderTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public Note(int i, String str, String str2, Priority priority, boolean z, Long l, long j, long j2) {
        str.getClass();
        str2.getClass();
        priority.getClass();
        this.id = i;
        this.title = str;
        this.content = str2;
        this.priority = priority;
        this.isPinned = z;
        this.reminderTime = l;
        this.createdAt = j;
        this.updatedAt = j2;
    }
}
