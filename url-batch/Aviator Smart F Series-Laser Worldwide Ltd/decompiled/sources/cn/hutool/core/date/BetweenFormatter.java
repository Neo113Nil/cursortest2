package cn.hutool.core.date;

import java.io.Serializable;

/* loaded from: classes.dex */
public class BetweenFormatter implements Serializable {
    private static final long serialVersionUID = 1;
    private long betweenMs;
    private Level level;
    private final int levelMaxCount;

    public enum Level {
        DAY("天"),
        HOUR("小时"),
        MINUTE("分"),
        SECOND("秒"),
        MILLISECOND("毫秒");

        private final String name;

        Level(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public BetweenFormatter(long j8, Level level) {
        this(j8, level, 0);
    }

    private boolean isLevelCountValid(int i8) {
        int i9 = this.levelMaxCount;
        return i9 <= 0 || i8 < i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String format() {
        int i8;
        Level level;
        Level level2;
        Level level3;
        Level level4;
        StringBuilder sb = new StringBuilder();
        long j8 = this.betweenMs;
        if (j8 > 0) {
            long millis = j8 / DateUnit.DAY.getMillis();
            long j9 = 24 * millis;
            long millis2 = (this.betweenMs / DateUnit.HOUR.getMillis()) - j9;
            long millis3 = ((this.betweenMs / DateUnit.MINUTE.getMillis()) - (1440 * millis)) - (millis2 * 60);
            long j10 = (((j9 + millis2) * 60) + millis3) * 60;
            long millis4 = (this.betweenMs / DateUnit.SECOND.getMillis()) - j10;
            long j11 = this.betweenMs - ((j10 + millis4) * 1000);
            int ordinal = this.level.ordinal();
            if (isLevelCountValid(0) && 0 != millis) {
                Level level5 = Level.DAY;
                if (ordinal >= level5.ordinal()) {
                    sb.append(millis);
                    sb.append(level5.name);
                    i8 = 1;
                    if (isLevelCountValid(i8) && 0 != millis2) {
                        level4 = Level.HOUR;
                        if (ordinal >= level4.ordinal()) {
                            sb.append(millis2);
                            sb.append(level4.name);
                            i8++;
                        }
                    }
                    if (isLevelCountValid(i8) && 0 != millis3) {
                        level3 = Level.MINUTE;
                        if (ordinal >= level3.ordinal()) {
                            sb.append(millis3);
                            sb.append(level3.name);
                            i8++;
                        }
                    }
                    if (isLevelCountValid(i8) && 0 != millis4) {
                        level2 = Level.SECOND;
                        if (ordinal >= level2.ordinal()) {
                            sb.append(millis4);
                            sb.append(level2.name);
                            i8++;
                        }
                    }
                    if (isLevelCountValid(i8) && 0 != j11) {
                        level = Level.MILLISECOND;
                        if (ordinal >= level.ordinal()) {
                            sb.append(j11);
                            sb.append(level.name);
                        }
                    }
                }
            }
            i8 = 0;
            if (isLevelCountValid(i8)) {
                level4 = Level.HOUR;
                if (ordinal >= level4.ordinal()) {
                }
            }
            if (isLevelCountValid(i8)) {
                level3 = Level.MINUTE;
                if (ordinal >= level3.ordinal()) {
                }
            }
            if (isLevelCountValid(i8)) {
                level2 = Level.SECOND;
                if (ordinal >= level2.ordinal()) {
                }
            }
            if (isLevelCountValid(i8)) {
                level = Level.MILLISECOND;
                if (ordinal >= level.ordinal()) {
                }
            }
        }
        if (cn.hutool.core.text.l.isEmpty(sb)) {
            sb.append(0);
            sb.append(this.level.name);
        }
        return sb.toString();
    }

    public long getBetweenMs() {
        return this.betweenMs;
    }

    public Level getLevel() {
        return this.level;
    }

    public void setBetweenMs(long j8) {
        this.betweenMs = j8;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String toString() {
        return format();
    }

    public BetweenFormatter(long j8, Level level, int i8) {
        this.betweenMs = j8;
        this.level = level;
        this.levelMaxCount = i8;
    }
}
