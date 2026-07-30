package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.Ecg;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class EcgDao extends a {
    public static final String TABLENAME = "ECG";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Date = new f(1, Date.class, "date", false, "DATE");
        public static final f AverageHeartRate = new f(2, Integer.class, "averageHeartRate", false, "AVERAGE_HEART_RATE");
        public static final f PerGridNumber = new f(3, Integer.class, "perGridNumber", false, "PER_GRID_NUMBER");
        public static final f PerGridUvValue = new f(4, Integer.class, "perGridUvValue", false, "PER_GRID_UV_VALUE");
        public static final f HeartRateVariability = new f(5, Integer.class, "heartRateVariability", false, "HEART_RATE_VARIABILITY");
        public static final f Fatigue = new f(6, Integer.class, "fatigue", false, "FATIGUE");
        public static final f Path = new f(7, String.class, "path", false, "PATH");
        public static final f DiagnosisUrl = new f(8, String.class, "diagnosisUrl", false, "DIAGNOSIS_URL");
        public static final f MentalStress = new f(9, Integer.class, "mentalStress", false, "MENTAL_STRESS");
        public static final f HeartLoad = new f(10, Integer.class, "heartLoad", false, "HEART_LOAD");
        public static final f HeartRateStrength = new f(11, Integer.class, "heartRateStrength", false, "HEART_RATE_STRENGTH");
        public static final f HeartRateSlow = new f(12, Boolean.class, "heartRateSlow", false, "HEART_RATE_SLOW");
        public static final f HeartRateFast = new f(13, Boolean.class, "heartRateFast", false, "HEART_RATE_FAST");
        public static final f HeartRateMisaligned = new f(14, Boolean.class, "heartRateMisaligned", false, "HEART_RATE_MISALIGNED");
        public static final f PrematureBeat = new f(15, Integer.class, "prematureBeat", false, "PREMATURE_BEAT");
        public static final f HeartRateStop = new f(16, Integer.class, "heartRateStop", false, "HEART_RATE_STOP");
        public static final f Leakage = new f(17, Integer.class, "leakage", false, "LEAKAGE");
        public static final f DiagnosisType = new f(18, Integer.class, "diagnosisType", false, "DIAGNOSIS_TYPE");
        public static final f Time = new f(19, Integer.class, "time", false, "TIME");
    }

    public EcgDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"ECG\" (\"_id\" INTEGER PRIMARY KEY ,\"DATE\" INTEGER NOT NULL ,\"AVERAGE_HEART_RATE\" INTEGER,\"PER_GRID_NUMBER\" INTEGER,\"PER_GRID_UV_VALUE\" INTEGER,\"HEART_RATE_VARIABILITY\" INTEGER,\"FATIGUE\" INTEGER,\"PATH\" TEXT,\"DIAGNOSIS_URL\" TEXT,\"MENTAL_STRESS\" INTEGER,\"HEART_LOAD\" INTEGER,\"HEART_RATE_STRENGTH\" INTEGER,\"HEART_RATE_SLOW\" INTEGER,\"HEART_RATE_FAST\" INTEGER,\"HEART_RATE_MISALIGNED\" INTEGER,\"PREMATURE_BEAT\" INTEGER,\"HEART_RATE_STOP\" INTEGER,\"LEAKAGE\" INTEGER,\"DIAGNOSIS_TYPE\" INTEGER,\"TIME\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"ECG\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public EcgDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Ecg ecg) {
        if (ecg != null) {
            return ecg.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Ecg ecg) {
        return ecg.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Ecg ecg, long j8) {
        ecg.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Ecg ecg) {
        cVar.clearBindings();
        Long id = ecg.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        cVar.bindLong(2, ecg.getDate().getTime());
        if (ecg.getAverageHeartRate() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        if (ecg.getPerGridNumber() != null) {
            cVar.bindLong(4, r0.intValue());
        }
        if (ecg.getPerGridUvValue() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (ecg.getHeartRateVariability() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        if (ecg.getFatigue() != null) {
            cVar.bindLong(7, r0.intValue());
        }
        String path = ecg.getPath();
        if (path != null) {
            cVar.bindString(8, path);
        }
        String diagnosisUrl = ecg.getDiagnosisUrl();
        if (diagnosisUrl != null) {
            cVar.bindString(9, diagnosisUrl);
        }
        if (ecg.getMentalStress() != null) {
            cVar.bindLong(10, r0.intValue());
        }
        if (ecg.getHeartLoad() != null) {
            cVar.bindLong(11, r0.intValue());
        }
        if (ecg.getHeartRateStrength() != null) {
            cVar.bindLong(12, r0.intValue());
        }
        Boolean heartRateSlow = ecg.getHeartRateSlow();
        if (heartRateSlow != null) {
            cVar.bindLong(13, heartRateSlow.booleanValue() ? 1L : 0L);
        }
        Boolean heartRateFast = ecg.getHeartRateFast();
        if (heartRateFast != null) {
            cVar.bindLong(14, heartRateFast.booleanValue() ? 1L : 0L);
        }
        Boolean heartRateMisaligned = ecg.getHeartRateMisaligned();
        if (heartRateMisaligned != null) {
            cVar.bindLong(15, heartRateMisaligned.booleanValue() ? 1L : 0L);
        }
        if (ecg.getPrematureBeat() != null) {
            cVar.bindLong(16, r0.intValue());
        }
        if (ecg.getHeartRateStop() != null) {
            cVar.bindLong(17, r0.intValue());
        }
        if (ecg.getLeakage() != null) {
            cVar.bindLong(18, r0.intValue());
        }
        if (ecg.getDiagnosisType() != null) {
            cVar.bindLong(19, r0.intValue());
        }
        if (ecg.getTime() != null) {
            cVar.bindLong(20, r9.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public Ecg readEntity(Cursor cursor, int i8) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Long valueOf4 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        Date date = new Date(cursor.getLong(i8 + 1));
        int i9 = i8 + 2;
        Integer valueOf5 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 3;
        Integer valueOf6 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 4;
        Integer valueOf7 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i8 + 5;
        Integer valueOf8 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i8 + 6;
        Integer valueOf9 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i8 + 7;
        String string = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i8 + 8;
        String string2 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i8 + 9;
        Integer valueOf10 = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
        int i17 = i8 + 10;
        Integer valueOf11 = cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17));
        int i18 = i8 + 11;
        Integer valueOf12 = cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18));
        int i19 = i8 + 12;
        if (cursor.isNull(i19)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i19) != 0);
        }
        int i20 = i8 + 13;
        if (cursor.isNull(i20)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i20) != 0);
        }
        int i21 = i8 + 14;
        if (cursor.isNull(i21)) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        int i22 = i8 + 15;
        Integer valueOf13 = cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22));
        int i23 = i8 + 16;
        Integer valueOf14 = cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23));
        int i24 = i8 + 17;
        Integer valueOf15 = cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24));
        int i25 = i8 + 18;
        Integer valueOf16 = cursor.isNull(i25) ? null : Integer.valueOf(cursor.getInt(i25));
        int i26 = i8 + 19;
        return new Ecg(valueOf4, date, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, string, string2, valueOf10, valueOf11, valueOf12, valueOf, valueOf2, valueOf3, valueOf13, valueOf14, valueOf15, valueOf16, cursor.isNull(i26) ? null : Integer.valueOf(cursor.getInt(i26)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Ecg ecg, int i8) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        ecg.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        ecg.setDate(new Date(cursor.getLong(i8 + 1)));
        int i9 = i8 + 2;
        ecg.setAverageHeartRate(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 3;
        ecg.setPerGridNumber(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 4;
        ecg.setPerGridUvValue(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i8 + 5;
        ecg.setHeartRateVariability(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 6;
        ecg.setFatigue(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 7;
        ecg.setPath(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i8 + 8;
        ecg.setDiagnosisUrl(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i8 + 9;
        ecg.setMentalStress(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i8 + 10;
        ecg.setHeartLoad(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i8 + 11;
        ecg.setHeartRateStrength(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i8 + 12;
        if (cursor.isNull(i19)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i19) != 0);
        }
        ecg.setHeartRateSlow(valueOf);
        int i20 = i8 + 13;
        if (cursor.isNull(i20)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i20) != 0);
        }
        ecg.setHeartRateFast(valueOf2);
        int i21 = i8 + 14;
        if (cursor.isNull(i21)) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        ecg.setHeartRateMisaligned(valueOf3);
        int i22 = i8 + 15;
        ecg.setPrematureBeat(cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22)));
        int i23 = i8 + 16;
        ecg.setHeartRateStop(cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23)));
        int i24 = i8 + 17;
        ecg.setLeakage(cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24)));
        int i25 = i8 + 18;
        ecg.setDiagnosisType(cursor.isNull(i25) ? null : Integer.valueOf(cursor.getInt(i25)));
        int i26 = i8 + 19;
        ecg.setTime(cursor.isNull(i26) ? null : Integer.valueOf(cursor.getInt(i26)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Ecg ecg) {
        sQLiteStatement.clearBindings();
        Long id = ecg.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        sQLiteStatement.bindLong(2, ecg.getDate().getTime());
        if (ecg.getAverageHeartRate() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        if (ecg.getPerGridNumber() != null) {
            sQLiteStatement.bindLong(4, r0.intValue());
        }
        if (ecg.getPerGridUvValue() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (ecg.getHeartRateVariability() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        if (ecg.getFatigue() != null) {
            sQLiteStatement.bindLong(7, r0.intValue());
        }
        String path = ecg.getPath();
        if (path != null) {
            sQLiteStatement.bindString(8, path);
        }
        String diagnosisUrl = ecg.getDiagnosisUrl();
        if (diagnosisUrl != null) {
            sQLiteStatement.bindString(9, diagnosisUrl);
        }
        if (ecg.getMentalStress() != null) {
            sQLiteStatement.bindLong(10, r0.intValue());
        }
        if (ecg.getHeartLoad() != null) {
            sQLiteStatement.bindLong(11, r0.intValue());
        }
        if (ecg.getHeartRateStrength() != null) {
            sQLiteStatement.bindLong(12, r0.intValue());
        }
        Boolean heartRateSlow = ecg.getHeartRateSlow();
        if (heartRateSlow != null) {
            sQLiteStatement.bindLong(13, heartRateSlow.booleanValue() ? 1L : 0L);
        }
        Boolean heartRateFast = ecg.getHeartRateFast();
        if (heartRateFast != null) {
            sQLiteStatement.bindLong(14, heartRateFast.booleanValue() ? 1L : 0L);
        }
        Boolean heartRateMisaligned = ecg.getHeartRateMisaligned();
        if (heartRateMisaligned != null) {
            sQLiteStatement.bindLong(15, heartRateMisaligned.booleanValue() ? 1L : 0L);
        }
        if (ecg.getPrematureBeat() != null) {
            sQLiteStatement.bindLong(16, r0.intValue());
        }
        if (ecg.getHeartRateStop() != null) {
            sQLiteStatement.bindLong(17, r0.intValue());
        }
        if (ecg.getLeakage() != null) {
            sQLiteStatement.bindLong(18, r0.intValue());
        }
        if (ecg.getDiagnosisType() != null) {
            sQLiteStatement.bindLong(19, r0.intValue());
        }
        if (ecg.getTime() != null) {
            sQLiteStatement.bindLong(20, r9.intValue());
        }
    }
}
