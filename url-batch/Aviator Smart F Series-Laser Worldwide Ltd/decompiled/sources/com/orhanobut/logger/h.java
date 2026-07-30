package com.orhanobut.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.hutool.core.text.l;

/* loaded from: classes4.dex */
public class h implements com.orhanobut.logger.b {
    private static final String BOTTOM_BORDER = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final char BOTTOM_LEFT_CORNER = 9492;
    private static final int CHUNK_SIZE = 4000;
    private static final String DOUBLE_DIVIDER = "────────────────────────────────────────────────────────";
    private static final char HORIZONTAL_LINE = 9474;
    private static final String MIDDLE_BORDER = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final char MIDDLE_CORNER = 9500;
    private static final int MIN_STACK_OFFSET = 5;
    private static final String SINGLE_DIVIDER = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String TOP_BORDER = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final char TOP_LEFT_CORNER = 9484;

    @NonNull
    private final d logStrategy;
    private final int methodCount;
    private final int methodOffset;
    private final boolean showThreadInfo;

    @Nullable
    private final String tag;

    public static class b {

        @Nullable
        d logStrategy;
        int methodCount;
        int methodOffset;
        boolean showThreadInfo;

        @Nullable
        String tag;

        @NonNull
        public h build() {
            if (this.logStrategy == null) {
                this.logStrategy = new e();
            }
            return new h(this);
        }

        @NonNull
        public b logStrategy(@Nullable d dVar) {
            this.logStrategy = dVar;
            return this;
        }

        @NonNull
        public b methodCount(int i8) {
            this.methodCount = i8;
            return this;
        }

        @NonNull
        public b methodOffset(int i8) {
            this.methodOffset = i8;
            return this;
        }

        @NonNull
        public b showThreadInfo(boolean z7) {
            this.showThreadInfo = z7;
            return this;
        }

        @NonNull
        public b tag(@Nullable String str) {
            this.tag = str;
            return this;
        }

        private b() {
            this.methodCount = 2;
            this.methodOffset = 0;
            this.showThreadInfo = true;
            this.tag = "PRETTY_LOGGER";
        }
    }

    @Nullable
    private String formatTag(@Nullable String str) {
        if (j.isEmpty(str) || j.equals(this.tag, str)) {
            return this.tag;
        }
        return this.tag + "-" + str;
    }

    private String getSimpleClassName(@NonNull String str) {
        j.checkNotNull(str);
        return str.substring(str.lastIndexOf(".") + 1);
    }

    private int getStackOffset(@NonNull StackTraceElement[] stackTraceElementArr) {
        j.checkNotNull(stackTraceElementArr);
        for (int i8 = 5; i8 < stackTraceElementArr.length; i8++) {
            String className = stackTraceElementArr[i8].getClassName();
            if (!className.equals(g.class.getName()) && !className.equals(f.class.getName())) {
                return i8 - 1;
            }
        }
        return -1;
    }

    private void logBottomBorder(int i8, @Nullable String str) {
        logChunk(i8, str, BOTTOM_BORDER);
    }

    private void logChunk(int i8, @Nullable String str, @NonNull String str2) {
        j.checkNotNull(str2);
        this.logStrategy.log(i8, str, str2);
    }

    private void logContent(int i8, @Nullable String str, @NonNull String str2) {
        j.checkNotNull(str2);
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            logChunk(i8, str, "│ " + str3);
        }
    }

    private void logDivider(int i8, @Nullable String str) {
        logChunk(i8, str, MIDDLE_BORDER);
    }

    private void logHeaderContent(int i8, @Nullable String str, int i9) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (this.showThreadInfo) {
            logChunk(i8, str, "│ Thread: " + Thread.currentThread().getName());
            logDivider(i8, str);
        }
        int stackOffset = getStackOffset(stackTrace) + this.methodOffset;
        if (i9 + stackOffset > stackTrace.length) {
            i9 = (stackTrace.length - stackOffset) - 1;
        }
        String str2 = "";
        while (i9 > 0) {
            int i10 = i9 + stackOffset;
            if (i10 < stackTrace.length) {
                str2 = str2 + "   ";
                logChunk(i8, str, HORIZONTAL_LINE + ' ' + str2 + getSimpleClassName(stackTrace[i10].getClassName()) + "." + stackTrace[i10].getMethodName() + l.SPACE + " (" + stackTrace[i10].getFileName() + ":" + stackTrace[i10].getLineNumber() + ")");
            }
            i9--;
        }
    }

    private void logTopBorder(int i8, @Nullable String str) {
        logChunk(i8, str, TOP_BORDER);
    }

    @NonNull
    public static b newBuilder() {
        return new b();
    }

    @Override // com.orhanobut.logger.b
    public void log(int i8, @Nullable String str, @NonNull String str2) {
        j.checkNotNull(str2);
        String formatTag = formatTag(str);
        logTopBorder(i8, formatTag);
        logHeaderContent(i8, formatTag, this.methodCount);
        byte[] bytes = str2.getBytes();
        int length = bytes.length;
        if (length <= 4000) {
            if (this.methodCount > 0) {
                logDivider(i8, formatTag);
            }
            logContent(i8, formatTag, str2);
            logBottomBorder(i8, formatTag);
            return;
        }
        if (this.methodCount > 0) {
            logDivider(i8, formatTag);
        }
        for (int i9 = 0; i9 < length; i9 += 4000) {
            logContent(i8, formatTag, new String(bytes, i9, Math.min(length - i9, 4000)));
        }
        logBottomBorder(i8, formatTag);
    }

    private h(@NonNull b bVar) {
        j.checkNotNull(bVar);
        this.methodCount = bVar.methodCount;
        this.methodOffset = bVar.methodOffset;
        this.showThreadInfo = bVar.showThreadInfo;
        this.logStrategy = bVar.logStrategy;
        this.tag = bVar.tag;
    }
}
