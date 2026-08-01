package u0;

import android.content.Context;
import com.fortunequest.neontrack.data.FortuneQuestDatabase;

/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366e {
    public FortuneQuestDatabase a(Context context) {
        k1.e.e(context, "context");
        FortuneQuestDatabase fortuneQuestDatabase = FortuneQuestDatabase.f2095m;
        if (fortuneQuestDatabase == null) {
            synchronized (this) {
                try {
                    fortuneQuestDatabase = FortuneQuestDatabase.f2095m;
                    if (fortuneQuestDatabase == null) {
                        Context applicationContext = context.getApplicationContext();
                        k1.e.d(applicationContext, "getApplicationContext(...)");
                        if (r1.d.L("fortune_quest.db")) {
                            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                        }
                        FortuneQuestDatabase a2 = new h0.o(applicationContext).a();
                        FortuneQuestDatabase.f2095m = a2;
                        fortuneQuestDatabase = a2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fortuneQuestDatabase;
    }
}
