package dev.cct.translatorapp.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dev.cct.translatorapp.dataModel.ConversationModel;
import dev.cct.translatorapp.dataModel.FavoriteModel;
import dev.cct.translatorapp.dataModel.HistoryModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes3.dex */
public final class TranslationDao_Impl implements TranslationDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<ConversationModel> __deletionAdapterOfConversationModel;
    private final EntityDeletionOrUpdateAdapter<FavoriteModel> __deletionAdapterOfFavoriteModel;
    private final EntityDeletionOrUpdateAdapter<HistoryModel> __deletionAdapterOfHistoryModel;
    private final EntityInsertionAdapter<ConversationModel> __insertionAdapterOfConversationModel;
    private final EntityInsertionAdapter<FavoriteModel> __insertionAdapterOfFavoriteModel;
    private final EntityInsertionAdapter<HistoryModel> __insertionAdapterOfHistoryModel;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllConversations;
    private final EntityDeletionOrUpdateAdapter<FavoriteModel> __updateAdapterOfFavoriteModel;
    private final EntityDeletionOrUpdateAdapter<HistoryModel> __updateAdapterOfHistoryModel;

    public TranslationDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfHistoryModel = new EntityInsertionAdapter<HistoryModel>(__db) { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `history` (`id`,`iLangC`,`oLangC`,`input`,`output`,`isFavorite`,`isSelected`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, HistoryModel historyModel) {
                supportSQLiteStatement.bindLong(1, historyModel.getId());
                if (historyModel.getILangC() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, historyModel.getILangC());
                }
                if (historyModel.getOLangC() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, historyModel.getOLangC());
                }
                if (historyModel.getInput() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, historyModel.getInput());
                }
                if (historyModel.getOutput() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, historyModel.getOutput());
                }
                supportSQLiteStatement.bindLong(6, historyModel.isFavorite() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, historyModel.isSelected() ? 1L : 0L);
            }
        };
        this.__insertionAdapterOfFavoriteModel = new EntityInsertionAdapter<FavoriteModel>(__db) { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `favorite` (`id`,`iLangC`,`oLangC`,`input`,`output`,`isFavorite`,`isSelected`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, FavoriteModel favoriteModel) {
                supportSQLiteStatement.bindLong(1, favoriteModel.getId());
                if (favoriteModel.getILangC() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, favoriteModel.getILangC());
                }
                if (favoriteModel.getOLangC() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, favoriteModel.getOLangC());
                }
                if (favoriteModel.getInput() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, favoriteModel.getInput());
                }
                if (favoriteModel.getOutput() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, favoriteModel.getOutput());
                }
                supportSQLiteStatement.bindLong(6, favoriteModel.isFavorite() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, favoriteModel.isSelected() ? 1L : 0L);
            }
        };
        this.__insertionAdapterOfConversationModel = new EntityInsertionAdapter<ConversationModel>(__db) { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `conversation` (`id`,`input`,`output`,`inputLang`,`outputLang`,`itemType`,`iLangC`,`oLangC`,`isFavorite`,`isSelected`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ConversationModel conversationModel) {
                supportSQLiteStatement.bindLong(1, conversationModel.getId());
                if (conversationModel.getInput() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, conversationModel.getInput());
                }
                if (conversationModel.getOutput() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, conversationModel.getOutput());
                }
                if (conversationModel.getInputLang() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, conversationModel.getInputLang());
                }
                if (conversationModel.getOutputLang() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, conversationModel.getOutputLang());
                }
                if (conversationModel.getItemType() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, conversationModel.getItemType());
                }
                if (conversationModel.getILangC() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, conversationModel.getILangC());
                }
                if (conversationModel.getOLangC() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, conversationModel.getOLangC());
                }
                supportSQLiteStatement.bindLong(9, conversationModel.isFavorite() ? 1L : 0L);
                supportSQLiteStatement.bindLong(10, conversationModel.isSelected() ? 1L : 0L);
            }
        };
        this.__deletionAdapterOfHistoryModel = new EntityDeletionOrUpdateAdapter<HistoryModel>(__db) { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.4
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `history` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, HistoryModel value) {
                stmt.bindLong(1, value.getId());
            }
        };
        this.__deletionAdapterOfFavoriteModel = new EntityDeletionOrUpdateAdapter<FavoriteModel>(__db) { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.5
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `favorite` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, FavoriteModel value) {
                stmt.bindLong(1, value.getId());
            }
        };
        this.__deletionAdapterOfConversationModel = new EntityDeletionOrUpdateAdapter<ConversationModel>(__db) { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.6
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `conversation` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, ConversationModel value) {
                stmt.bindLong(1, value.getId());
            }
        };
        this.__updateAdapterOfHistoryModel = new EntityDeletionOrUpdateAdapter<HistoryModel>(__db) { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.7
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `history` SET `id` = ?,`iLangC` = ?,`oLangC` = ?,`input` = ?,`output` = ?,`isFavorite` = ?,`isSelected` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, HistoryModel historyModel) {
                supportSQLiteStatement.bindLong(1, historyModel.getId());
                if (historyModel.getILangC() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, historyModel.getILangC());
                }
                if (historyModel.getOLangC() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, historyModel.getOLangC());
                }
                if (historyModel.getInput() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, historyModel.getInput());
                }
                if (historyModel.getOutput() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, historyModel.getOutput());
                }
                supportSQLiteStatement.bindLong(6, historyModel.isFavorite() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, historyModel.isSelected() ? 1L : 0L);
                supportSQLiteStatement.bindLong(8, historyModel.getId());
            }
        };
        this.__updateAdapterOfFavoriteModel = new EntityDeletionOrUpdateAdapter<FavoriteModel>(__db) { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.8
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `favorite` SET `id` = ?,`iLangC` = ?,`oLangC` = ?,`input` = ?,`output` = ?,`isFavorite` = ?,`isSelected` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, FavoriteModel favoriteModel) {
                supportSQLiteStatement.bindLong(1, favoriteModel.getId());
                if (favoriteModel.getILangC() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, favoriteModel.getILangC());
                }
                if (favoriteModel.getOLangC() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, favoriteModel.getOLangC());
                }
                if (favoriteModel.getInput() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, favoriteModel.getInput());
                }
                if (favoriteModel.getOutput() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, favoriteModel.getOutput());
                }
                supportSQLiteStatement.bindLong(6, favoriteModel.isFavorite() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, favoriteModel.isSelected() ? 1L : 0L);
                supportSQLiteStatement.bindLong(8, favoriteModel.getId());
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.9
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM history";
            }
        };
        this.__preparedStmtOfDeleteAllConversations = new SharedSQLiteStatement(__db) { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.10
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM conversation";
            }
        };
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public Object insert(final HistoryModel translation, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.11
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                TranslationDao_Impl.this.__db.beginTransaction();
                try {
                    TranslationDao_Impl.this.__insertionAdapterOfHistoryModel.insert((EntityInsertionAdapter) translation);
                    TranslationDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    TranslationDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public Object addToFavorite(final FavoriteModel translation, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.12
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                TranslationDao_Impl.this.__db.beginTransaction();
                try {
                    TranslationDao_Impl.this.__insertionAdapterOfFavoriteModel.insert((EntityInsertionAdapter) translation);
                    TranslationDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    TranslationDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public Object insertConversation(final ConversationModel translation, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.13
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                TranslationDao_Impl.this.__db.beginTransaction();
                try {
                    TranslationDao_Impl.this.__insertionAdapterOfConversationModel.insert((EntityInsertionAdapter) translation);
                    TranslationDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    TranslationDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public Object deleteTranslation(final HistoryModel translation, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.14
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                TranslationDao_Impl.this.__db.beginTransaction();
                try {
                    TranslationDao_Impl.this.__deletionAdapterOfHistoryModel.handle(translation);
                    TranslationDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    TranslationDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public Object removeFromFavorite(final FavoriteModel translation, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.15
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                TranslationDao_Impl.this.__db.beginTransaction();
                try {
                    TranslationDao_Impl.this.__deletionAdapterOfFavoriteModel.handle(translation);
                    TranslationDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    TranslationDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public Object deleteConversation(final ConversationModel translation, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.16
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                TranslationDao_Impl.this.__db.beginTransaction();
                try {
                    TranslationDao_Impl.this.__deletionAdapterOfConversationModel.handle(translation);
                    TranslationDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    TranslationDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public int updateFavorite(final HistoryModel translation) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int handle = this.__updateAdapterOfHistoryModel.handle(translation) + 0;
            this.__db.setTransactionSuccessful();
            return handle;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public int updateFavorite2(final FavoriteModel translation) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int handle = this.__updateAdapterOfFavoriteModel.handle(translation) + 0;
            this.__db.setTransactionSuccessful();
            return handle;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public Object deleteAll(final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.17
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = TranslationDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                TranslationDao_Impl.this.__db.beginTransaction();
                try {
                    acquire.executeUpdateDelete();
                    TranslationDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    TranslationDao_Impl.this.__db.endTransaction();
                    TranslationDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                }
            }
        }, continuation);
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public Object deleteAllConversations(final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: dev.cct.translatorapp.dao.TranslationDao_Impl.18
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = TranslationDao_Impl.this.__preparedStmtOfDeleteAllConversations.acquire();
                TranslationDao_Impl.this.__db.beginTransaction();
                try {
                    acquire.executeUpdateDelete();
                    TranslationDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    TranslationDao_Impl.this.__db.endTransaction();
                    TranslationDao_Impl.this.__preparedStmtOfDeleteAllConversations.release(acquire);
                }
            }
        }, continuation);
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public List<HistoryModel> getAllTranslations() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM history ORDER BY id DESC", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, FacebookMediationAdapter.KEY_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "iLangC");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "oLangC");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, AgentOptions.OUTPUT);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "isFavorite");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "isSelected");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new HistoryModel(query.getInt(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getInt(columnIndexOrThrow7) != 0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public HistoryModel getLastTranslation() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM history ORDER BY id DESC LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        HistoryModel historyModel = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, FacebookMediationAdapter.KEY_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "iLangC");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "oLangC");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, AgentOptions.OUTPUT);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "isFavorite");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "isSelected");
            if (query.moveToFirst()) {
                historyModel = new HistoryModel(query.getInt(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getInt(columnIndexOrThrow7) != 0);
            }
            return historyModel;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public List<HistoryModel> getFavoriteHistory() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM history WHERE isFavorite=true", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, FacebookMediationAdapter.KEY_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "iLangC");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "oLangC");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, AgentOptions.OUTPUT);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "isFavorite");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "isSelected");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new HistoryModel(query.getInt(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getInt(columnIndexOrThrow7) != 0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public List<FavoriteModel> getFavorites() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM favorite", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, FacebookMediationAdapter.KEY_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "iLangC");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "oLangC");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, AgentOptions.OUTPUT);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "isFavorite");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "isSelected");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new FavoriteModel(query.getInt(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getInt(columnIndexOrThrow7) != 0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public List<ConversationModel> getAllConversations() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM conversation", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, FacebookMediationAdapter.KEY_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, AgentOptions.OUTPUT);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "inputLang");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "outputLang");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "itemType");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "iLangC");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "oLangC");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isFavorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "isSelected");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new ConversationModel(query.getInt(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9) != 0, query.getInt(columnIndexOrThrow10) != 0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // dev.cct.translatorapp.dao.TranslationDao
    public ConversationModel getLastConversation() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM conversation ORDER BY id DESC LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        ConversationModel conversationModel = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, FacebookMediationAdapter.KEY_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, AgentOptions.OUTPUT);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "inputLang");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "outputLang");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "itemType");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "iLangC");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "oLangC");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isFavorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "isSelected");
            if (query.moveToFirst()) {
                conversationModel = new ConversationModel(query.getInt(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9) != 0, query.getInt(columnIndexOrThrow10) != 0);
            }
            return conversationModel;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
