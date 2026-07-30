package com.moyoung.classes;

import com.moyoung.classes.coach.model.net.ActionDetailResp;
import com.moyoung.classes.coach.model.net.CoachCourseDetailResp;
import com.moyoung.classes.coach.model.net.CoachTagResp;
import com.moyoung.classes.coach.model.net.RelatedCourseResp;
import com.moyoung.classes.meditation.model.BaseResponseBean;
import com.moyoung.classes.meditation.model.MeditationTagResp;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassResp;
import io.reactivex.Observable;
import java.util.List;
import r7.s;
import r7.t;

/* loaded from: classes4.dex */
public interface a {
    public static final String BASE_CLASSES_URL = "https://api.moyoung.com";

    @r7.f("/fusion-hub/coach/program/workout/{id}")
    Observable<BaseResponseBean<ActionDetailResp>> requestCoachActionDetail(@s("id") int i8, @t("language") String str);

    @r7.f("/fusion-hub/coach/program/detail/{id}")
    Observable<BaseResponseBean<CoachCourseDetailResp>> requestCoachCourseDetail(@s("id") int i8, @t("language") String str);

    @r7.f("/fusion-hub/coach/program/related")
    Observable<BaseResponseBean<List<RelatedCourseResp>>> requestCoachRelatedCourseList(@t("language") String str, @t("categories_id") String str2, @t("page") int i8, @t("per_page") int i9, @t("id") int i10);

    @r7.f("/fusion-hub/coach/program/type-list")
    Observable<BaseResponseBean<List<CoachTagResp>>> requestCoachTagList(@t("language") String str, @t("page") String str2, @t("per_page") String str3);

    @r7.f("/fusion-hub/meditation/program/detail/{id}")
    Observable<BaseResponseBean<OnlineClassResp>> requestMeditationOnlineClassDetail(@s("id") int i8, @t("language") String str);

    @r7.f("/fusion-hub/meditation/program/type-list")
    Observable<BaseResponseBean<List<MeditationTagResp>>> requestMeditationTagList(@t("language") String str, @t("page") String str2, @t("per_page") String str3);
}
