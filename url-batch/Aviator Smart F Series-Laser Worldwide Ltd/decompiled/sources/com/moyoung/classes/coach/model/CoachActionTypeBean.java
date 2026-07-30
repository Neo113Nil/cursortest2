package com.moyoung.classes.coach.model;

import com.moyoung.classes.R$string;
import com.moyoung.classes.coach.model.net.CoachCourseDetailResp;
import com.moyoung.dafit.module.common.utils.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachActionTypeBean implements Serializable {
    private final List<CoachActionBean> actionBeanList;
    private final String typeTitle;

    public CoachActionTypeBean(String str, List<CoachActionBean> list) {
        this.typeTitle = str;
        this.actionBeanList = list;
    }

    public static List<CoachActionTypeBean> convert(CoachCourseDetailResp coachCourseDetailResp) {
        ArrayList arrayList = new ArrayList();
        if (coachCourseDetailResp.getCourses().getWarn_up() != null && coachCourseDetailResp.getCourses().getWarn_up().size() > 0) {
            arrayList.add(new CoachActionTypeBean(d.get().getString(R$string.fitness_warm_up_title), CoachActionBean.convert(coachCourseDetailResp.getCourses().getWarn_up(), coachCourseDetailResp.getSource_file(), coachCourseDetailResp.getAudio(), coachCourseDetailResp.getPrepareAudio())));
        }
        if (coachCourseDetailResp.getCourses().getPhysical() != null && coachCourseDetailResp.getCourses().getPhysical().size() > 0) {
            arrayList.add(new CoachActionTypeBean(d.get().getString(R$string.fitness_exercise_title), CoachActionBean.convert(coachCourseDetailResp.getCourses().getPhysical(), coachCourseDetailResp.getSource_file(), coachCourseDetailResp.getAudio(), coachCourseDetailResp.getPrepareAudio())));
        }
        if (coachCourseDetailResp.getCourses().getDraw() != null && coachCourseDetailResp.getCourses().getDraw().size() > 0) {
            arrayList.add(new CoachActionTypeBean(d.get().getString(R$string.fitness_stretch_title), CoachActionBean.convert(coachCourseDetailResp.getCourses().getDraw(), coachCourseDetailResp.getSource_file(), coachCourseDetailResp.getAudio(), coachCourseDetailResp.getPrepareAudio())));
        }
        return arrayList;
    }

    public List<CoachActionBean> getActionBeanList() {
        return this.actionBeanList;
    }

    public String getTypeTitle() {
        return this.typeTitle;
    }
}
