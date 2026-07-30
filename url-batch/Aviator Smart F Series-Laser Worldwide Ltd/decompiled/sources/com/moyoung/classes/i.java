package com.moyoung.classes;

import android.accounts.NetworkErrorException;
import com.moyoung.classes.coach.model.CoachCourseBean;
import com.moyoung.classes.coach.model.CoachCourseTagBean;
import com.moyoung.classes.coach.model.net.ActionDetailResp;
import com.moyoung.classes.coach.model.net.CoachCourseDetailResp;
import com.moyoung.classes.coach.model.net.CoachTagResp;
import com.moyoung.classes.coach.model.net.RelatedCourseResp;
import com.moyoung.classes.meditation.model.BaseResponseBean;
import com.moyoung.classes.meditation.model.MeditationTagResp;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassResp;
import com.moyoung.dafit.module.common.utils.ServerLanguageUtil;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;

/* loaded from: classes4.dex */
public class i {
    private static final int NET_RESULT_OK = 200;
    private final a apiStores = j.getInstance().getApiStores();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ActionDetailResp lambda$requestCoachActionDetail$5(BaseResponseBean baseResponseBean) {
        if (baseResponseBean == null || baseResponseBean.getCode() != 2000 || baseResponseBean.getData() == null) {
            throw new NetworkErrorException("net error");
        }
        return (ActionDetailResp) baseResponseBean.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CoachCourseBean lambda$requestCoachCourse$3(BaseResponseBean baseResponseBean) {
        if (baseResponseBean == null || baseResponseBean.getCode() != 2000 || baseResponseBean.getData() == null) {
            throw new NetworkErrorException("net error");
        }
        return CoachCourseBean.convert((CoachCourseDetailResp) baseResponseBean.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$requestCoachRelatedCourseList$4(BaseResponseBean baseResponseBean) {
        if (baseResponseBean == null || baseResponseBean.getCode() != 2000 || baseResponseBean.getData() == null) {
            throw new NetworkErrorException("net error");
        }
        return (List) baseResponseBean.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$requestCoachTagList$2(BaseResponseBean baseResponseBean) {
        if (baseResponseBean == null || baseResponseBean.getCode() != 200 || baseResponseBean.getData() == null) {
            throw new NetworkErrorException("net error");
        }
        return CoachCourseTagBean.convert((List<CoachTagResp>) baseResponseBean.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OnlineClassResp lambda$requestMeditationOnlineClassDetail$1(BaseResponseBean baseResponseBean) {
        if (baseResponseBean == null || baseResponseBean.getCode() != 2000 || baseResponseBean.getData() == null) {
            throw new NetworkErrorException("net error");
        }
        return (OnlineClassResp) baseResponseBean.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$requestMeditationTagList$0(BaseResponseBean baseResponseBean) {
        if (baseResponseBean == null || baseResponseBean.getCode() != 200 || baseResponseBean.getData() == null) {
            throw new NetworkErrorException("net error");
        }
        return (List) baseResponseBean.getData();
    }

    public Observable<ActionDetailResp> requestCoachActionDetail(int i8) {
        return this.apiStores.requestCoachActionDetail(i8, ServerLanguageUtil.getRequestLanguage()).map(new Function() { // from class: com.moyoung.classes.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ActionDetailResp lambda$requestCoachActionDetail$5;
                lambda$requestCoachActionDetail$5 = i.lambda$requestCoachActionDetail$5((BaseResponseBean) obj);
                return lambda$requestCoachActionDetail$5;
            }
        });
    }

    public Observable<CoachCourseBean> requestCoachCourse(int i8) {
        return this.apiStores.requestCoachCourseDetail(i8, ServerLanguageUtil.getRequestLanguage()).map(new Function() { // from class: com.moyoung.classes.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CoachCourseBean lambda$requestCoachCourse$3;
                lambda$requestCoachCourse$3 = i.lambda$requestCoachCourse$3((BaseResponseBean) obj);
                return lambda$requestCoachCourse$3;
            }
        });
    }

    public Observable<List<RelatedCourseResp>> requestCoachRelatedCourseList(String str, int i8) {
        return this.apiStores.requestCoachRelatedCourseList(ServerLanguageUtil.getRequestLanguage(), str, 1, 6, i8).map(new Function() { // from class: com.moyoung.classes.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List lambda$requestCoachRelatedCourseList$4;
                lambda$requestCoachRelatedCourseList$4 = i.lambda$requestCoachRelatedCourseList$4((BaseResponseBean) obj);
                return lambda$requestCoachRelatedCourseList$4;
            }
        });
    }

    public Observable<List<CoachCourseTagBean>> requestCoachTagList() {
        return this.apiStores.requestCoachTagList(ServerLanguageUtil.getRequestLanguage(), "1", "15").map(new Function() { // from class: com.moyoung.classes.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List lambda$requestCoachTagList$2;
                lambda$requestCoachTagList$2 = i.lambda$requestCoachTagList$2((BaseResponseBean) obj);
                return lambda$requestCoachTagList$2;
            }
        });
    }

    public Observable<OnlineClassResp> requestMeditationOnlineClassDetail(int i8) {
        return this.apiStores.requestMeditationOnlineClassDetail(i8, ServerLanguageUtil.getRequestLanguage()).map(new Function() { // from class: com.moyoung.classes.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                OnlineClassResp lambda$requestMeditationOnlineClassDetail$1;
                lambda$requestMeditationOnlineClassDetail$1 = i.lambda$requestMeditationOnlineClassDetail$1((BaseResponseBean) obj);
                return lambda$requestMeditationOnlineClassDetail$1;
            }
        });
    }

    public Observable<List<MeditationTagResp>> requestMeditationTagList() {
        return this.apiStores.requestMeditationTagList(ServerLanguageUtil.getRequestLanguage(), "1", "15").map(new Function() { // from class: com.moyoung.classes.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List lambda$requestMeditationTagList$0;
                lambda$requestMeditationTagList$0 = i.lambda$requestMeditationTagList$0((BaseResponseBean) obj);
                return lambda$requestMeditationTagList$0;
            }
        });
    }
}
