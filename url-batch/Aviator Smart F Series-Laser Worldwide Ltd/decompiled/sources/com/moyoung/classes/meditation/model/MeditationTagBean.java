package com.moyoung.classes.meditation.model;

import com.moyoung.classes.meditation.model.MeditationTagResp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class MeditationTagBean<T> {
    private final List<T> dataList;
    private final boolean isLocalClass;
    private final String title;

    public MeditationTagBean(String str, List<T> list, boolean z7) {
        this.title = str;
        this.dataList = list;
        this.isLocalClass = z7;
    }

    public static List<MeditationTagBean> convert(List<MeditationTagResp> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MeditationTagResp> it = list.iterator();
        while (it.hasNext()) {
            MeditationTagBean convert = convert(it.next());
            if (convert != null) {
                arrayList.add(convert);
            }
        }
        return arrayList;
    }

    public List<T> getDataList() {
        return this.dataList;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isLocalClass() {
        return this.isLocalClass;
    }

    public static MeditationTagBean convert(MeditationTagResp meditationTagResp) {
        List<MeditationTagResp.Course> courseList = meditationTagResp.getCourseList();
        if (courseList == null || courseList.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MeditationTagResp.Course course : courseList) {
            arrayList.add(new OnlineClassShortBean(course.getId(), course.getName(), course.getDuration(), course.getThumbnail()));
        }
        return new MeditationTagBean(meditationTagResp.getName(), arrayList, false);
    }
}
