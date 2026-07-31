package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Dao;
import kotlin.Metadata;

/* compiled from: WorkProgressDao.kt */
@Dao
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/work/impl/model/WorkProgressDao;", "", "Landroidx/work/impl/model/WorkProgress;", "progress", "", "insert", "(Landroidx/work/impl/model/WorkProgress;)V", "", "workSpecId", "delete", "(Ljava/lang/String;)V", "deleteAll", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes5.dex */
public interface WorkProgressDao {
    void delete(String workSpecId);

    void deleteAll();

    void insert(WorkProgress progress);
}
