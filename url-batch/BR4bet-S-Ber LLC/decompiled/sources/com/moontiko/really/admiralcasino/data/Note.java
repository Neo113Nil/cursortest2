package com.moontiko.really.admiralcasino.data;

import defpackage.kr;
import defpackage.zf;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class Note {
    private final String category;
    private final String colorHex;
    private final String content;
    private final long createdAt;
    private final int id;
    private final boolean isPinned;
    private final String title;
    private final long updatedAt;

    public /* synthetic */ Note(int i, String str, String str2, String str3, String str4, boolean z, long j, long j2, int i2, zf zfVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "#FAFAFA" : str3, (i2 & 16) != 0 ? "Personal" : str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? System.currentTimeMillis() : j, (i2 & 128) != 0 ? System.currentTimeMillis() : j2);
    }

    public static /* synthetic */ Note copy$default(Note note, int i, String str, String str2, String str3, String str4, boolean z, long j, long j2, int i2, Object obj) {
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
            str3 = note.colorHex;
        }
        if ((i2 & 16) != 0) {
            str4 = note.category;
        }
        if ((i2 & 32) != 0) {
            z = note.isPinned;
        }
        if ((i2 & 64) != 0) {
            j = note.createdAt;
        }
        if ((i2 & 128) != 0) {
            j2 = note.updatedAt;
        }
        long j3 = j2;
        long j4 = j;
        String str5 = str4;
        boolean z2 = z;
        return note.copy(i, str, str2, str3, str5, z2, j4, j3);
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

    public final String component4() {
        return this.colorHex;
    }

    public final String component5() {
        return this.category;
    }

    public final boolean component6() {
        return this.isPinned;
    }

    public final long component7() {
        return this.createdAt;
    }

    public final long component8() {
        return this.updatedAt;
    }

    public final Note copy(int i, String str, String str2, String str3, String str4, boolean z, long j, long j2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new Note(i, str, str2, str3, str4, z, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Note)) {
            return false;
        }
        Note note = (Note) obj;
        return this.id == note.id && kr.b(this.title, note.title) && kr.b(this.content, note.content) && kr.b(this.colorHex, note.colorHex) && kr.b(this.category, note.category) && this.isPinned == note.isPinned && this.createdAt == note.createdAt && this.updatedAt == note.updatedAt;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getColorHex() {
        return this.colorHex;
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

    public final String getTitle() {
        return this.title;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return Long.hashCode(this.updatedAt) + ((Long.hashCode(this.createdAt) + ((Boolean.hashCode(this.isPinned) + ((this.category.hashCode() + ((this.colorHex.hashCode() + ((this.content.hashCode() + ((this.title.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public String toString() {
        return "Note(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", colorHex=" + this.colorHex + ", category=" + this.category + ", isPinned=" + this.isPinned + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    public Note(int i, String str, String str2, String str3, String str4, boolean z, long j, long j2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.id = i;
        this.title = str;
        this.content = str2;
        this.colorHex = str3;
        this.category = str4;
        this.isPinned = z;
        this.createdAt = j;
        this.updatedAt = j2;
    }

    public Note() {
        this(0, null, null, null, null, false, 0L, 0L, 255, null);
    }
}
