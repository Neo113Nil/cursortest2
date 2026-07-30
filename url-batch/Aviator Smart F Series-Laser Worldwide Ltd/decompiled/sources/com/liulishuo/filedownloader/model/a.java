package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import com.liulishuo.filedownloader.util.f;
import java.util.List;

/* loaded from: classes4.dex */
public class a {
    public static final String CURRENT_OFFSET = "currentOffset";
    public static final String END_OFFSET = "endOffset";
    public static final String ID = "id";
    public static final String INDEX = "connectionIndex";
    public static final String START_OFFSET = "startOffset";
    private long currentOffset;
    private long endOffset;
    private int id;
    private int index;
    private long startOffset;

    public static long getTotalOffset(List<a> list) {
        long j8 = 0;
        for (a aVar : list) {
            j8 += aVar.getCurrentOffset() - aVar.getStartOffset();
        }
        return j8;
    }

    public long getCurrentOffset() {
        return this.currentOffset;
    }

    public long getEndOffset() {
        return this.endOffset;
    }

    public int getId() {
        return this.id;
    }

    public int getIndex() {
        return this.index;
    }

    public long getStartOffset() {
        return this.startOffset;
    }

    public void setCurrentOffset(long j8) {
        this.currentOffset = j8;
    }

    public void setEndOffset(long j8) {
        this.endOffset = j8;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setIndex(int i8) {
        this.index = i8;
    }

    public void setStartOffset(long j8) {
        this.startOffset = j8;
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(this.id));
        contentValues.put(INDEX, Integer.valueOf(this.index));
        contentValues.put(START_OFFSET, Long.valueOf(this.startOffset));
        contentValues.put(CURRENT_OFFSET, Long.valueOf(this.currentOffset));
        contentValues.put(END_OFFSET, Long.valueOf(this.endOffset));
        return contentValues;
    }

    public String toString() {
        return f.formatString("id[%d] index[%d] range[%d, %d) current offset(%d)", Integer.valueOf(this.id), Integer.valueOf(this.index), Long.valueOf(this.startOffset), Long.valueOf(this.endOffset), Long.valueOf(this.currentOffset));
    }
}
