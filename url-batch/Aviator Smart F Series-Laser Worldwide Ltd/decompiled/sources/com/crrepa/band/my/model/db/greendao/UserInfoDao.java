package com.crrepa.band.my.model.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.crrepa.band.my.model.db.UserInfo;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Date;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.f;

/* loaded from: classes2.dex */
public class UserInfoDao extends a {
    public static final String TABLENAME = "USER_INFO";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, FileDownloadModel.ID);
        public static final f Gender = new f(1, Integer.class, "gender", false, "GENDER");
        public static final f BirthYear = new f(2, Integer.class, "birthYear", false, "BIRTH_YEAR");
        public static final f Birthday = new f(3, Date.class, "birthday", false, "BIRTHDAY");
        public static final f HeightCm = new f(4, Integer.class, "heightCm", false, "HEIGHT_CM");
        public static final f HeightIn = new f(5, Integer.class, "heightIn", false, "HEIGHT_IN");
        public static final f StepLengthCm = new f(6, Integer.class, "stepLengthCm", false, "STEP_LENGTH_CM");
        public static final f StepLengthIn = new f(7, Integer.class, "stepLengthIn", false, "STEP_LENGTH_IN");
        public static final f WeightKg = new f(8, Float.class, "weightKg", false, "WEIGHT_KG");
        public static final f WeightLbs = new f(9, Float.class, "weightLbs", false, "WEIGHT_LBS");
    }

    public UserInfoDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        aVar.execSQL("CREATE TABLE " + (z7 ? "IF NOT EXISTS " : "") + "\"USER_INFO\" (\"_id\" INTEGER PRIMARY KEY ,\"GENDER\" INTEGER,\"BIRTH_YEAR\" INTEGER,\"BIRTHDAY\" INTEGER,\"HEIGHT_CM\" INTEGER,\"HEIGHT_IN\" INTEGER,\"STEP_LENGTH_CM\" INTEGER,\"STEP_LENGTH_IN\" INTEGER,\"WEIGHT_KG\" REAL,\"WEIGHT_LBS\" REAL);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z7 ? "IF EXISTS " : "");
        sb.append("\"USER_INFO\"");
        aVar.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.a
    protected final boolean isEntityUpdateable() {
        return true;
    }

    public UserInfoDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(UserInfo userInfo) {
        if (userInfo != null) {
            return userInfo.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(UserInfo userInfo) {
        return userInfo.getId() != null;
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
    public final Long updateKeyAfterInsert(UserInfo userInfo, long j8) {
        userInfo.setId(Long.valueOf(j8));
        return Long.valueOf(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, UserInfo userInfo) {
        cVar.clearBindings();
        Long id = userInfo.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        if (userInfo.getGender() != null) {
            cVar.bindLong(2, r0.intValue());
        }
        if (userInfo.getBirthYear() != null) {
            cVar.bindLong(3, r0.intValue());
        }
        Date birthday = userInfo.getBirthday();
        if (birthday != null) {
            cVar.bindLong(4, birthday.getTime());
        }
        if (userInfo.getHeightCm() != null) {
            cVar.bindLong(5, r0.intValue());
        }
        if (userInfo.getHeightIn() != null) {
            cVar.bindLong(6, r0.intValue());
        }
        if (userInfo.getStepLengthCm() != null) {
            cVar.bindLong(7, r0.intValue());
        }
        if (userInfo.getStepLengthIn() != null) {
            cVar.bindLong(8, r0.intValue());
        }
        if (userInfo.getWeightKg() != null) {
            cVar.bindDouble(9, r0.floatValue());
        }
        if (userInfo.getWeightLbs() != null) {
            cVar.bindDouble(10, r6.floatValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public UserInfo readEntity(Cursor cursor, int i8) {
        Long valueOf = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i8 + 1;
        Integer valueOf2 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i8 + 2;
        Integer valueOf3 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i8 + 3;
        Date date = cursor.isNull(i11) ? null : new Date(cursor.getLong(i11));
        int i12 = i8 + 4;
        Integer valueOf4 = cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12));
        int i13 = i8 + 5;
        Integer valueOf5 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i8 + 6;
        Integer valueOf6 = cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14));
        int i15 = i8 + 7;
        Integer valueOf7 = cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15));
        int i16 = i8 + 8;
        int i17 = i8 + 9;
        return new UserInfo(valueOf, valueOf2, valueOf3, date, valueOf4, valueOf5, valueOf6, valueOf7, cursor.isNull(i16) ? null : Float.valueOf(cursor.getFloat(i16)), cursor.isNull(i17) ? null : Float.valueOf(cursor.getFloat(i17)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, UserInfo userInfo, int i8) {
        userInfo.setId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i8 + 1;
        userInfo.setGender(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i8 + 2;
        userInfo.setBirthYear(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i8 + 3;
        userInfo.setBirthday(cursor.isNull(i11) ? null : new Date(cursor.getLong(i11)));
        int i12 = i8 + 4;
        userInfo.setHeightCm(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i8 + 5;
        userInfo.setHeightIn(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i8 + 6;
        userInfo.setStepLengthCm(cursor.isNull(i14) ? null : Integer.valueOf(cursor.getInt(i14)));
        int i15 = i8 + 7;
        userInfo.setStepLengthIn(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i8 + 8;
        userInfo.setWeightKg(cursor.isNull(i16) ? null : Float.valueOf(cursor.getFloat(i16)));
        int i17 = i8 + 9;
        userInfo.setWeightLbs(cursor.isNull(i17) ? null : Float.valueOf(cursor.getFloat(i17)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, UserInfo userInfo) {
        sQLiteStatement.clearBindings();
        Long id = userInfo.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        if (userInfo.getGender() != null) {
            sQLiteStatement.bindLong(2, r0.intValue());
        }
        if (userInfo.getBirthYear() != null) {
            sQLiteStatement.bindLong(3, r0.intValue());
        }
        Date birthday = userInfo.getBirthday();
        if (birthday != null) {
            sQLiteStatement.bindLong(4, birthday.getTime());
        }
        if (userInfo.getHeightCm() != null) {
            sQLiteStatement.bindLong(5, r0.intValue());
        }
        if (userInfo.getHeightIn() != null) {
            sQLiteStatement.bindLong(6, r0.intValue());
        }
        if (userInfo.getStepLengthCm() != null) {
            sQLiteStatement.bindLong(7, r0.intValue());
        }
        if (userInfo.getStepLengthIn() != null) {
            sQLiteStatement.bindLong(8, r0.intValue());
        }
        if (userInfo.getWeightKg() != null) {
            sQLiteStatement.bindDouble(9, r0.floatValue());
        }
        if (userInfo.getWeightLbs() != null) {
            sQLiteStatement.bindDouble(10, r6.floatValue());
        }
    }
}
